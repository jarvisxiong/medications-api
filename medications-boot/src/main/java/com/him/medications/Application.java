package com.him.medications;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.UnknownHostException;


@SpringBootApplication
@EnableDubboConfiguration
public class Application {
	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(Application.class, args);
	}
}
