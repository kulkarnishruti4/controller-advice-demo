package com.demo.controller.advice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.controller.advice.exception.CustomResourceNotFoundException;

@RestController
public class DemoController {
	
	
	@GetMapping("/generateException")
	public String getResource(@RequestParam(value = "id", required = false) String id) throws CustomResourceNotFoundException {
		
        if (id == null || id.equals("0")) {
        	
            throw new CustomResourceNotFoundException("Resource with id " + id + " not found");
        }
        return "Resource with id " + id;
    }

}
