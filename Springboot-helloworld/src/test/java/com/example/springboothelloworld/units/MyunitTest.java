package com.example.springboothelloworld.units;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyunitTest {
    @Test
    @DisplayName("输入1+1，输出2")
    public void add_test(){
        Assertions.assertEquals(3,Myunit.add(1,1));
    }
}
