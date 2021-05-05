package com.example.mybatisexamples.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//One-to-Many(查找用户id=1的所有地址)

@Data
@NoArgsConstructor
public class UserWithDetails {
    private Long id;
    private String name;
    private List<Address> details;
}
