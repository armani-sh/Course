package com.example.mybatisexamples.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@TableName("user")

public class User {
    private Long id;
    private String name;
}
