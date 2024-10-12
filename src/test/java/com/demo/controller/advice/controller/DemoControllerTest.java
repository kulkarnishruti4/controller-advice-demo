package com.demo.controller.advice.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import com.demo.controller.advice.exception.GlobalExceptionHandler;

@WebMvcTest(DemoController.class)
@Import(GlobalExceptionHandler.class)
public class DemoControllerTest {
	
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void validResponsetest() throws Exception {
		mockMvc.perform(get("/generateException").param("id", "1"))
        .andExpect(status().isOk());
	}
	
	
	@Test
    public void whenInvalidId_thenReturn404() throws Exception {
        mockMvc.perform(get("/resource").param("id", "0"))
               .andExpect(status().isNotFound());
    }

}
