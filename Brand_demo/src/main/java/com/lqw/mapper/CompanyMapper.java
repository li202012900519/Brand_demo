package com.lqw.mapper;

import com.lqw.pojo.Account;
import com.lqw.pojo.Company;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CompanyMapper {
    @Select("select * from tb_company")
    List<Company> selectCompany();

    @Select("select * from tb_company where identify = #{identify}")
    Company selectCompanyById(Integer identify);

    @Update("update tb_company set company =  #{company} where identify = #{identify}")
    void update(Company company);


}
