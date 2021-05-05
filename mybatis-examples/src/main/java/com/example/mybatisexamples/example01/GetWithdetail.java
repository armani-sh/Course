package com.example.mybatisexamples.example01;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Withdetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GetWithdetail extends BaseMapper<Withdetail> {
    @Select(
            "select u.*, " +
                    "a.detail "+
                    "from user u join address a "+
                    "on u.id=a.userid "+
                    "where a.detail=#{detail}"
    )
    List<Withdetail> ListWithDetail(String detail);

}
