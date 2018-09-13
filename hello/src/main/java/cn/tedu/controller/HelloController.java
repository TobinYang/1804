package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	String name="123";
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "helloSpringBoot"+name;
	}
}
