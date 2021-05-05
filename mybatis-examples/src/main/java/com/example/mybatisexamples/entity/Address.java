package com.example.mybatisexamples.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private Long id;
    private String detail;
    private Long userid;

}
