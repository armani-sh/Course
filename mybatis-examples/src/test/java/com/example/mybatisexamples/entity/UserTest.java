package com.example.mybatisexamples.entity;


import com.example.mybatisexamples.example01.AdressMapper;
import com.example.mybatisexamples.example01.GetWithUser;
import com.example.mybatisexamples.example01.GetWithdetail;
import com.example.mybatisexamples.example01.Usermapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@SpringBootTest
@Transactional
@Slf4j
@Rollback(value = false)
public class UserTest {
    @Autowired
    private Usermapper usermapper;
    @Autowired
    private AdressMapper adressMapper;
    @Autowired
    private GetWithdetail getWithdetail;
    @Autowired
    private GetWithUser getWithUser;


    @Test
    public void selectUser_Test(){
        for (User user:usermapper.ListByDetail("BeiJing")){
            log.debug("{}/{}",user.getId(),user.getName());
        }
    }

    @Test
    public void userlist_Test(){
        for (User user:usermapper.USER_LIST()){
            log.debug("{}",user.getId());
        }
    }

    //(查找地址为北京的所有用户)
    @Test
    @DisplayName("查找地址为北京的所有用户")
    public void FindWithDetail(){
        for(Withdetail ad : getWithdetail.ListWithDetail("BeiJing")){
            log.debug("{}",ad);
        }
    }

    //One-to-Many(查找用户id=1的基本信息和所有地址)
    @Test
    @DisplayName("查找用户id=1的基本信息和所有地址")
    public void FindUserAllAddress(){
        Long id=1L;
        User user=usermapper.selectById(id);
        List<Address> details=adressMapper.selectByMap(Map.of("userid",id));
        UserWithDetails userWithDetails=new UserWithDetails();
        BeanUtils.copyProperties(user,userWithDetails);
        userWithDetails.setDetails(details);
        log.debug("{}",userWithDetails);
    }

    //One-to-One(查找地址为北京的地址信息及用户基本信息 ##"resultMap映射")
    @Test
    @DisplayName("查找地址为北京的地址信息及用户基本信息")
    public void FindDetailWithUser(){

        Long id=202101L;
        for (DetailWithUser du: getWithUser.ListDetailWithUser(id)){
            log.debug("{}",du);
        }
    }
}
