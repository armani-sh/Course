package com.example.mybatisexamples.entity;

import com.example.mybatisexamples.example01.UserMapperBase;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Slf4j
@Rollback(value = false)

public class UserTest01 {
    @Autowired
    private UserMapperBase userMapperBase;

    @Test
    public void InsertUserTest(){
        User user01=new User();
        user01.setId((long)5);
        user01.setName("XiaoWen");
        userMapperBase.insert(user01);
    }

    @Test
    public void UpdateTest(){
        userMapperBase.update("LiXian");
    }

    @Test
    public void listTest(){
        for (User u:userMapperBase.userList()){
            log.debug("{} / {}",u.getId(),u.getName());
        }
    }
}
