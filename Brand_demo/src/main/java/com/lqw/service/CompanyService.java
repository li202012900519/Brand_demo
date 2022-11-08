package com.lqw.service;

import com.lqw.mapper.CompanyMapper;
import com.lqw.pojo.Company;
import com.lqw.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CompanyService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Company> selectCompany() {
        SqlSession sqlSession = factory.openSession();
        CompanyMapper mapper = sqlSession.getMapper(CompanyMapper.class);
        List<Company> companys = mapper.selectCompany();
        sqlSession.close();
        return companys;
    }


    public Company selectCompanyById(int identify) {
        SqlSession sqlSession = factory.openSession();
        CompanyMapper mapper = sqlSession.getMapper(CompanyMapper.class);
        Company company = mapper.selectCompanyById(identify);
        System.out.println(company);
        sqlSession.close();
        return company;
    }

     public void update(Company company) {
        SqlSession sqlSession = factory.openSession();
        CompanyMapper mapper = sqlSession.getMapper(CompanyMapper.class);
        mapper.update(company);
        sqlSession.commit();
        sqlSession.close();
    }
}
