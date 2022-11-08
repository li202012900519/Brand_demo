package com.lqw.mapper;

import com.lqw.pojo.Company;
import com.lqw.pojo.Net;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface NetMapper {

    @Select("select * from tb_net")
    List<Net> selectNet();

    @Select("select * from tb_net where identify = #{identify}")
    Net selectNetById(Integer identify);

    @Update("update tb_net set net =  #{net} where identify = #{identify}")
    void update(Net net);

}
