package com.liu.template.templatespringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.liu.template.templatespringboot.mapper")
public class TemplateSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateSpringbootApplication.class, args);
	}
}
