package com.example.mybatisexamples.example01;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Address;
import com.example.mybatisexamples.entity.UserWithDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface AdressMapper extends BaseMapper<Address> {

}
