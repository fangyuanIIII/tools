package com.lt.document.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class JsonObject {
	
	@SuppressWarnings("finally")
	public String readJsonStr(String path) {
		StringBuffer sb =new StringBuffer();
		Reader read = null;
		try {
			read = //new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)))) ;
					new BufferedReader(new FileReader(new File(path))) ;
			int ch = 0;
			while((ch=read.read()) != -1) {
				sb.append((char)ch);
			}
			
		}finally {
			try {
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return sb.toString();
		}
	}
}
