package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class HelloWorldControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void sayHello() {

    }

    @Test
    public void sayTime() {
    }

    @Test
    public void request() {
    }

    @Test
    public void request1() {
    }

    @Test
    public void requestPost() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/requestPost")
                .param("first", "Hi")
                .param("second", "50"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string(containsString("Hi")));
    }

    @Test
    public void requestPostMapping() {
    }

    @Test
    public void requestWithPathExplicit() {
    }
}