package com.example.springboothelloworld.example01;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String name;
}
