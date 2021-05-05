package com.example.mybatisexamples.example01;

import com.example.mybatisexamples.entity.DetailWithUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GetWithUser {
    List<DetailWithUser> ListDetailWithUser(@Param("id") Long id);
}
