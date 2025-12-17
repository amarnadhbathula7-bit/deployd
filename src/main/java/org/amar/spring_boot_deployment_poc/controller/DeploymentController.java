package org.amar.spring_boot_deployment_poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class DeploymentController {
	/* http://localhost:8080/deploy/get
	   https://github.com/amarnadhbathula7-bit/deployd.git
	*/
	@GetMapping("/get")
	public String getDeploy() {
		return "I am serving deploy controller";
	}
	
}
