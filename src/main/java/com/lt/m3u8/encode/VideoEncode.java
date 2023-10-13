package com.lt.m3u8.encode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.bytedeco.javacpp.avcodec;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FFmpegFrameRecorder;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.FrameRecorder;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncoderException;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.InputFormatException;
import ws.schild.jave.MultimediaObject;
import ws.schild.jave.VideoAttributes;

/**
 * MP4视频转码工具
 * @author luot
 * @date   2023年7月19日
 *
 *
 */
public class VideoEncode {
	
	 /**
     * @param inputFile  文件原始路径
     * @param outputFile 文件输出路径
     * @param id
     * @throws Exception
     */
    public static void encode(String inputFile, String outputFile){
        FFmpegFrameGrabber grabber = null ;
        Frame captured_frame;
        FFmpegFrameRecorder recorder = null;
 
        try {
        	grabber = FFmpegFrameGrabber.createDefault(inputFile);
            grabber.start();
            
            recorder = new FFmpegFrameRecorder(outputFile, grabber.getImageWidth(), grabber.getImageHeight(),
                grabber.getAudioChannels());
            recorder.setVideoCodec(avcodec.AV_CODEC_ID_H264);
            recorder.setFormat("mp4");
            recorder.setFrameRate(grabber.getFrameRate());
            recorder.setSampleRate(grabber.getSampleRate());
            recorder.setVideoBitrate(grabber.getVideoBitrate());
            recorder.setAspectRatio(grabber.getAspectRatio());
            recorder.setAudioBitrate(grabber.getAudioBitrate());
            recorder.setAudioOptions(grabber.getAudioOptions());
            recorder.setAudioCodec(avcodec.AV_CODEC_ID_AAC);
            recorder.start();
 
            while (true) {
                captured_frame = grabber.grabFrame();
                if (captured_frame == null) {
                    break;
                }
                recorder.record(captured_frame);
            }
 
        } catch (FrameRecorder.Exception | org.bytedeco.javacv.FrameGrabber.Exception e) {
            e.printStackTrace();
        } finally {
            if (recorder != null) {
                try {
                    recorder.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
 
            try {
            	if(grabber != null) {
            		grabber.close();
            	}
            } catch (FrameGrabber.Exception e) {
            	e.printStackTrace();
            }
        }
    }
    
    /**
     * 批量编码
     * @param inputFile
     * @param outputFile
     */
    public static void batchEncode(String inputFile, String outputFile) {
    	fixedThreadPool.execute(getThread(inputFile, outputFile));
    }
    
    private static final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
    
    private static Thread getThread(String inputFile, String outputFile) {
		return new Thread(() -> {
			VideoEncode.encode(inputFile, outputFile);
		});
	}
    
    /**
     * 批量编码
     * @param inputFile
     * @param outputFile
     */
    public static void batchEncodeByAudio(String inputFile, String outputFile) {
    	fixedThreadPool.execute(getThreadByAudio(inputFile, outputFile));
    }
    
    private static Thread getThreadByAudio(String inputFile, String outputFile) {
		return new Thread(() -> {
			try {
				VideoEncode.encodeByAudio(inputFile, outputFile);
			} catch (IllegalArgumentException | EncoderException | IOException e) {
				e.printStackTrace();
			} 
		});
	}
    
    /**
     * 转码方法
     * @param in
     * @param out
     * @throws IllegalArgumentException
     * @throws InputFormatException
     * @throws EncoderException
     * @throws IOException 
     */
    public static void encodeByAudio(String in ,String out) throws IllegalArgumentException, EncoderException, IOException {
    	MultimediaObject source = new MultimediaObject(new File(in));  
        File target = new File(out);  
        if(!target.exists()) {
        	target.createNewFile();
        }
     
        AudioAttributes audio = new AudioAttributes();  
        audio.setCodec("libmp3lame");  
        audio.setBitRate(new Integer(56000));  
        audio.setChannels(new Integer(1));  
        audio.setSamplingRate(new Integer(22050));  
     
        VideoAttributes video = new VideoAttributes();  
        video.setCodec("libx264");  
     
        EncodingAttributes attrs = new EncodingAttributes();  
        attrs.setFormat("mp4");  //h264编码
        attrs.setAudioAttributes(audio);  
        attrs.setVideoAttributes(video);  
        Encoder encoder = new Encoder();  
        encoder.encode(source, target, attrs);  
    }
    
    /**
     * 解析为带有MP4后缀的名称
     * @param name
     */
    public static String parseMp4(String name) {
    	if(!("".equals(name) && null == name)) {
    		if(name.contains(".")) {
    			name = name.substring(0, name.lastIndexOf(".")) + ".mp4";
    		}else {
    			name = name + ".mp4";
    		}
    	}
    	return name;
    }
    
    public static String parseTs(String name) {
    	if(!("".equals(name) && null == name)) {
    		if(name.contains(".")) {
    			name = name.substring(0, name.lastIndexOf(".")) + ".ts";
    		}else {
    			name = name + ".ts";
    		}
    	}
    	return name;
    }
    
}
