package com.yan.zhang.lawyer_online;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yan.zhang.lawyer_online.core.mapper")
@ComponentScan("com.yan.zhang.lawyer_online.core")
public class LawyerOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LawyerOnlineApplication.class, args);
	}

}
