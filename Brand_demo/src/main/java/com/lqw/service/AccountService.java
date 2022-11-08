package com.lqw.service;

import com.lqw.mapper.AccountMapper;
import com.lqw.pojo.Account;
import com.lqw.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class AccountService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    public List<Account> selectByUsername(String username) {
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.selectByUsername(username);
        sqlSession.close();
        return accounts;
    }

    public List<Account> selectAllAccount() {
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        List<Account> accounts = mapper.selectAllAccount();
        sqlSession.close();
        return accounts;
    }

    public void delete(Integer identify) {
        SqlSession sqlSession = factory.openSession();
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        accountMapper.delete(identify);
        sqlSession.commit();
        sqlSession.close();
    }


    public Account selectByIdentify(int identify) {
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        Account account = mapper.selectByIdentify(identify);
        System.out.println(account);
        sqlSession.close();
        return account;
    }

    public void update(Account account) {
        SqlSession sqlSession = factory.openSession();
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
        mapper.update(account);
        sqlSession.commit();
        sqlSession.close();
    }
}
