package com.yan.zhang.lawyer_online;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yan.zhang.lawyer_online.core.mapper")
public class LawyerOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawyerOnlineApplication.class, args);
	}

}
