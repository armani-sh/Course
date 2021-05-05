package com.example.mybatisexamples.example01;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Usermapper extends BaseMapper<User>{
    @Select("select u.* from user u join address a "+
            "on u.id=a.userid "+
            "where a.detail=#{detail}"
    )
    List<User> ListByDetail(String detail);

    @Select("select * from user")
    List<User> USER_LIST();

}
