package com.ybear.blockchain.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ybear.blockchain.controller.annotation.ResponseWrapper;

@RestController
@RequestMapping("/hello")
@ResponseWrapper
public class HelloController {

	@RequestMapping("/")
	@PermitAll
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/list")
	@PermitAll
	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		return list;
	}

	@RequestMapping("/map")
	@PermitAll
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "asd");
		map.put("2", "ban");
		return map;
	}

	@RequestMapping("/error")
	@PermitAll
	public Exception exception() {
		return new Exception();

	}

}
