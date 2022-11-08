package com.lqw.mapper;

import com.lqw.pojo.Time;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TimeMapper {

    @Select("select * from tb_time where identify = #{identify}")
    List<Time> selectByUsername(Integer identify);

    @Select("select * from  tb_time")
    List<Time> selectAllTime();

    @Update("update tb_time set username = #{username},tel = #{tel},identify = #{identify}, teltime = #{teltime}, continuetime = #{continuetime} where identify = #{identify}")
    void updateTime(Time time);

    @Select("select * from tb_time where identify = #{identify}")
    Time selectByIdentify(Integer identify);

}
