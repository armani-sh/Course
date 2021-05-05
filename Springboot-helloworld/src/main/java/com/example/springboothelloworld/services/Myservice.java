package com.example.springboothelloworld.services;

import org.springframework.stereotype.Service;

@Service
public class Myservice {
    public int add(int x,int y){
        return x+y+1;
    }
}
