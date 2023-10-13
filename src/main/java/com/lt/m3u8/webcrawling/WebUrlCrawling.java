package com.lt.m3u8.webcrawling;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringEscapeUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.IOUtils;
import com.google.common.base.Strings;


public class WebUrlCrawling {
	
	/**
	 * 匹配网页a标签 具体格式  <a href="" 
	 */
	private static Pattern urlpattern = Pattern.compile("<a\\s+(?:[^>]*?\\s+)?href=\"([^\"]*)\"");
	//"]*href=(\\\"([^\\\"]*)\\\"|\\'([^\\']*)\\'|([^\\\\s>]*))[^>]*>(.*?)"
	
	/**
	 *
	 *精确匹配网页中一般有图片
	 */
	private static Pattern imgpattern = Pattern.compile("<img\\s+src\\s*=\\s*\"([^\"]+)\"\\s*/?>");
	
	/**
	 * 提取视频名称
	 */
	private static Pattern titlepattern = Pattern.compile("<title>(.*?)</title>");
	
	/**
	 * 获取网页中m3u8 url地址
	 */
	private static Pattern m3u8pattern = Pattern.compile("\"url\":\"(.+?index.m3u8)\"");
	
	/**
	 * 获取网页中m3u8 jsonurl地址
	 */
	private static Pattern m3u8jsonpattern = Pattern.compile("JSON.parse\\(atob\\(\"(.*?)\"\\)\\)");
	/**
	 * 获取网页中m3u8 jsonurl地址转为json获取url的key
	 */
	private static String m3u8jsonurlkey = "sl";
	
	
	private static String filename = "";
	
	private static final String User_Agent = 
			"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) "
			+ "Chrome/63.0.3239.108 Safari/537.36";
	
	/**
	 * 获取网页流
	 * @param url
	 * @return
	 */
	private static InputStream getUrlStream(String urls) {
		InputStream in = null;
		try {
			URL url = new URL(urls);
			// 2.获取远程连接
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	
			// 3.设置请求方式 请求参数 请求头
			urlConnection.setRequestMethod("POST");
			urlConnection.setDoOutput(true); // 原生jdk默认关闭了输出流
			urlConnection.setRequestProperty("User-Agent",User_Agent);
			urlConnection.setConnectTimeout(30000); // 连接超时 单位毫秒
			urlConnection.setReadTimeout(30000); // 读取超时 单位毫秒
			// 4.获取数据
			in = urlConnection.getInputStream();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return in;
	}
	
	/**
	 * 获取网页坐标列表
	 * @param urls
	 * @return
	 */
	public static List<String> getUrlCoordinates(String urls) {
		List<String> urlList = new ArrayList<>();
		InputStream in = null;
		BufferedReader reader = null;
		try {
			in = getUrlStream(urls);
			reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = reader.readLine()) != null) {
				Matcher matcher = urlpattern.matcher(line);
				if(matcher.find() && imgpattern.matcher(line).find()) {
					urlList.add(matcher.group(1));
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			IOUtils.close(in);
			IOUtils.close(reader);
		}
		return urlList;
	}
	
	/**
	 * 获取网页视频下载url
	 * @param url
	 * @return
	 */
	public static String getDownloadUrl(String url) {
		InputStream in = null;
		BufferedReader reader = null;
		try {
			in = getUrlStream(url);
			reader = new BufferedReader(new InputStreamReader(in));
			String line;
			
			while ((line = reader.readLine()) != null) {
				Matcher matcher = m3u8pattern.matcher(line);
				Matcher jsonmatcher = m3u8jsonpattern.matcher(line);
				if(Strings.isNullOrEmpty(filename)) {
					Matcher title = titlepattern.matcher(line);
					if(title.find()) {
						setFilename(title.group(1));
					}
				}
				
				if(matcher.find()) {
					return StringEscapeUtils.unescapeJava(matcher.group(1));
				}
				
				if(jsonmatcher.find()) {
					JSONObject obj = (JSONObject) JSON.parse(new String(Base64.getDecoder().decode(StringEscapeUtils.unescapeJava(jsonmatcher.group(1)))));
					return (String) obj.get(m3u8jsonurlkey);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			IOUtils.close(in);
			IOUtils.close(reader);
		}
		return "";
	}

	/**
	 * @return the filename
	 */
	public static String getFilename() {
		return filename;
	}

	/**
	 * @param filename the filename to set
	 */
	public static void setFilename(String filename) {
		WebUrlCrawling.filename = filename;
	}

	/**
	 * @return the urlpattern
	 */
	public static Pattern getUrlpattern() {
		return urlpattern;
	}

	/**
	 * @param urlpattern the urlpattern to set
	 */
	public static void setUrlpattern(Pattern urlpattern) {
		WebUrlCrawling.urlpattern = urlpattern;
	}

	/**
	 * @return the imgpattern
	 */
	public static Pattern getImgpattern() {
		return imgpattern;
	}

	/**
	 * @param imgpattern the imgpattern to set
	 */
	public static void setImgpattern(Pattern imgpattern) {
		WebUrlCrawling.imgpattern = imgpattern;
	}

	/**
	 * @return the titlepattern
	 */
	public static Pattern getTitlepattern() {
		return titlepattern;
	}

	/**
	 * @param titlepattern the titlepattern to set
	 */
	public static void setTitlepattern(Pattern titlepattern) {
		WebUrlCrawling.titlepattern = titlepattern;
	}

	/**
	 * @return the m3u8pattern
	 */
	public static Pattern getM3u8pattern() {
		return m3u8pattern;
	}

	/**
	 * @param m3u8pattern the m3u8pattern to set
	 */
	public static void setM3u8pattern(Pattern m3u8pattern) {
		WebUrlCrawling.m3u8pattern = m3u8pattern;
	}

	/**
	 * @return the m3u8jsonpattern
	 */
	public static Pattern getM3u8jsonpattern() {
		return m3u8jsonpattern;
	}

	/**
	 * @param m3u8jsonpattern the m3u8jsonpattern to set
	 */
	public static void setM3u8jsonpattern(Pattern m3u8jsonpattern) {
		WebUrlCrawling.m3u8jsonpattern = m3u8jsonpattern;
	}

	/**
	 * @return the m3u8jsonurlkey
	 */
	public static String getM3u8jsonurlkey() {
		return m3u8jsonurlkey;
	}

}
