package it.dstech.formazione.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	
	@GetMapping(value = "/demo")
	@ResponseBody
	public String example() {
		return "echo";
	}
}
