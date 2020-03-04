package com.techprimers.jpa.springjpahibernateexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UsersResource {
	
	//http://localhost:8111/rest/update?id=100
	@GetMapping("/update")
	public String updateQueryPram(@RequestParam("id") final Integer id) {
		return "hello Demo!!!!!!!!!!!!<--->" + id;
	}

	//http://localhost:8111/rest/update/100
	@GetMapping("/update/{id}")
	public String updatePath(@PathVariable("id") final Integer id) {
		return "hello Demo!!!!--->" + id;

	}

	@PostMapping("/create")
	public String create(@RequestBody  String id) {
		return "hello Demo!!!!--->" + id;

	}
	
}
