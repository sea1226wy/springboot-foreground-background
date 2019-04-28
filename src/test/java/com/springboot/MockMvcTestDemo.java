package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @auther Seay
 * @date 2019/4/18 13:39
 * 测试mockmvc
 */
@RunWith(SpringRunner.class)//底层用junit SpringJUnit4ClassRunner
@SpringBootTest(classes = {SpringbootDemoApplication.class})//启动整个springboot工程
@AutoConfigureMockMvc//与单元测试的区别
public class MockMvcTestDemo {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void apiTest() throws Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/testjson")).
                andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        System.out.println(mvcResult.getResponse().getStatus());
    }

}