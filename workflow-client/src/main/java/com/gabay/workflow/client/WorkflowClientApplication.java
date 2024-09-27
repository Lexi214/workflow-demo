package com.gabay.workflow.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gabay.workflow.client.mapper")
public class WorkflowClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkflowClientApplication.class, args);
	}

}
