package com.example.mybatisexamples.example01;


import com.example.mybatisexamples.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface UserMapperBase {
    @Insert("insert into user(id,name) values(#{id},#{name})")
    public void insert(User user);

    @Update("update user set name=#{uname} where id=4")
    public void update(String uname);

    @Delete("delete from user where id=#{did}")
    public void delete(long did);

    @Select("select * from user")
    List<User> userList();
}
