package com.gabay.workflow;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WorkflowApplicationTests {

	@Autowired
	ProcessEngine processEngine;

	@Autowired
	RepositoryService repositoryService;

	@Test
	public void getProcessEngine() {
		System.out.println(processEngine);
	}

	@Test
	public void deployProcess() {
		Deployment deployment = repositoryService.createDeployment()
				.name("请假申请流程")
				.addClasspathResource("process/leave.bpmn20.xml")
				.addClasspathResource("process/leave.png")
				.deploy();
		System.out.println(deployment);
	}
}
