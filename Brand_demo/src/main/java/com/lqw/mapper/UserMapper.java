package com.lqw.mapper;

import com.lqw.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {



    @Select("select * from tb_user where username = #{username} and password = #{password} and identify =#{identify}")
    User select(@Param("username") String username,@Param("password")  String password,@Param("identify")Integer identify);


    @Select("select * from tb_admin where username = #{username} and password = #{password} ")
    User select1(@Param("username") String username,@Param("password")  String password);


    @Select("select * from tb_user where username = #{username}")
    User selectByUsername(String username);


    @Insert("insert into tb_user values(#{username},#{password},null,null)")
    void add(User user);


    @Update("update tb_user set password = #{password} where username = #{username}")
    void changePassword(@Param("username") String username,@Param("password")String password);


    @Select("select * from tb_user")
    List<User> selectAllUer();


    @Delete("delete from tb_user where identify = #{identify}")
    void delete(Integer identify);

    @Select("select * from tb_user where identify = #{identify}")
    User selectUserByIdentify(Integer identify);

    @Insert("insert into tb_user values(#{username},#{password},#{identify},#{tel})")
    void add1(User user);

    @Update("update tb_user set username = #{username},password = #{password},tel = #{tel},identify = #{identify} where identify = #{identify}")
    void updateUser(User user);

    List<User> secletByCondition(@Param("user") User user);
}
