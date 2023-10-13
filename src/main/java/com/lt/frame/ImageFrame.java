package com.lt.frame;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;

/**
 * 获取视频的一帧照片
 * @author luot
 * @date   2023年9月22日
 *
 *
 */
public class ImageFrame {
	
	/***
	 * 获取视频照片并拷贝到输出流
	 * @param videoInputStream
	 * @param imgOutputStream
	 */
	public static void getVideoImg(InputStream videoInputStream,OutputStream imgOutputStream) {
		FFmpegFrameGrabber ff = null;
		try {
			ff = new FFmpegFrameGrabber(videoInputStream);
			ff.start();
			int ffLength = ff.getLengthInFrames();
			Frame f;
			int i = 0;
			while (i < ffLength) {
				f = ff.grabFrame();
				// 截取第6帧
				if ((i > 1) && (f.image != null)) {
					executeFrame(f, imgOutputStream);
					break;
				}
				i++;
			}
			ff.stop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				videoInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				ff.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void executeFrame(Frame frame,OutputStream imgOutputStream) {
		OutputStream output = null;
		ByteArrayInputStream input = null;
		try {
			String imageSuffix = "png";
			if (null == frame || null == frame.image) {
				return;
			}
			Java2DFrameConverter converter = new Java2DFrameConverter();
			BufferedImage bi = converter.getBufferedImage(frame);
			output = imgOutputStream;
			ImageIO.write(bi, imageSuffix, output);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (output != null) {
					output.close();
				}
				if (input != null) {
					input.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
