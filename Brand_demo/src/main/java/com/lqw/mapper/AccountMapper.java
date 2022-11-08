package com.lqw.mapper;

import com.lqw.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AccountMapper {
    @Select("select * from tb_account where username = #{username}")
    List<Account> selectByUsername(String username);

    @Select("select * from tb_account")
    List<Account> selectAllAccount();

    @Delete("delete from tb_account where identify = #{identify}")
    void delete(Integer identify);

    @Update("update tb_account set money =  #{money} where identify = #{identify}")
    void update(Account account);

    @Select("select * from tb_account where identify = #{identify}")
    @ResultMap("accountResultMap")
    Account selectByIdentify(int identify);

}
