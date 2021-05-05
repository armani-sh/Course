package com.example.mybatisexamples.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DetailWithUser {
    private Long id;
    private String detail;
    private User user;
}
