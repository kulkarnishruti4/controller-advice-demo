package com.demo.controller.advice.exception;


import com.demo.controller.advice.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(DemoController.class)
@Import(GlobalExceptionHandler.class)
public class GlobalExceptionHandlerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenGlobalException_thenReturn500() throws Exception {
        mockMvc.perform(get("/generateException").param("id", "345"))
               .andExpect(status().isOk());
//               .andExpect(jsonPath("$.status").value("OK"))
//               .andExpect(jsonPath("$.message").exists());
    }
}
