package com.example.springboothelloworld.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class UsersTest {
    @Autowired
    private EntityManager entityManager;

    @Test
    public void add_user(){
        Users user=new Users();
        user.setName("ShuHang");
        entityManager.persist(user);

    }


}
