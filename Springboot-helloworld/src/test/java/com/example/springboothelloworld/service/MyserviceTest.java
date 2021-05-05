package com.example.springboothelloworld.service;

import com.example.springboothelloworld.services.Myservice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyserviceTest {
    @Autowired
    private Myservice myservice;

    @Test
    public void test_add(){
        Assertions.assertEquals(2,myservice.add(1,1));
    }
}
