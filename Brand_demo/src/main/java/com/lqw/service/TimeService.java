package com.lqw.service;

import com.lqw.mapper.TimeMapper;
import com.lqw.pojo.Time;
import com.lqw.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class TimeService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    public List<Time> selectByUsername(Integer identify) {
        SqlSession sqlSession = factory.openSession();
        TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
        List<Time> times = mapper.selectByUsername(identify);
        sqlSession.close();
        return times;
    }

    public List<Time> selectAllTime() {
        SqlSession sqlSession = factory.openSession();
        TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
        List<Time> times = mapper.selectAllTime();
        sqlSession.close();
        return times;
    }

    public void  updateTime(Time time){
        SqlSession sqlSession = factory.openSession();
        TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
        mapper.updateTime(time);
        sqlSession.commit();
        sqlSession.close();
    }


    public Time selectByIdentify(Integer identify) {
        SqlSession sqlSession = factory.openSession();
        TimeMapper mapper = sqlSession.getMapper(TimeMapper.class);
        Time times = mapper.selectByIdentify(identify);
        sqlSession.close();
        return times;
    }

}
