package com.lt.config;


import javax.annotation.PostConstruct;

import org.bytedeco.javacpp.avutil;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LogConfig {
	
	@PostConstruct
	public void logConfig() {
		//frame包下 设置视频照片日志不显示
		avutil.av_log_set_level(avutil.AV_LOG_ERROR);

	}
	
}
