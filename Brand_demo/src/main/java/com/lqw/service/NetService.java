package com.lqw.service;

import com.lqw.mapper.NetMapper;
import com.lqw.pojo.Net;
import com.lqw.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class NetService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Net> selectNet() {
        SqlSession sqlSession = factory.openSession();
        NetMapper mapper = sqlSession.getMapper(NetMapper.class);
        List<Net> nets = mapper.selectNet();
        sqlSession.close();
        return nets;
    }


    public Net selectNetById(int identify) {
        SqlSession sqlSession = factory.openSession();
        NetMapper mapper = sqlSession.getMapper(NetMapper.class);
        Net net = mapper.selectNetById(identify);
        System.out.println(net);
        sqlSession.close();
        return net;
    }

    public void update(Net net) {
        SqlSession sqlSession = factory.openSession();
        NetMapper mapper = sqlSession.getMapper(NetMapper.class);
        mapper.update(net);
        sqlSession.commit();
        sqlSession.close();
    }
}
