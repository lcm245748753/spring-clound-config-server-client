package com.example.democonfigtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@SpringBootApplication
@EnableDiscoveryClient
public class DemoConfigTestApplication {

	static {
		System.setProperty("spring.application.name", "config-server");

		System.setProperty("mybatis.config-location", "classpath:mybatis.xml");
		System.setProperty("mybatis.mapper-locations", "classpath:mybatis/**/*.xml");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigTestApplication.class, args);
	}
}
