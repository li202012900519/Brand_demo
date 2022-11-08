package com.lqw.service;

import com.lqw.mapper.UserMapper;
import com.lqw.pojo.User;
import com.lqw.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.UnsupportedEncodingException;
import java.util.List;

public class UserService {

    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    public User login(String username, String password,Integer identify) throws UnsupportedEncodingException {
        String username1 = new String(username.getBytes("ISO8859-1"),"UTF-8");
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.select(username1,password,identify);
        sqlSession.close();
        System.out.println(username1);
        return user;
    }

    public User login1(String username, String password){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.select1(username, password);
        sqlSession.close();
        return user;
    }


    public boolean register(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User u = mapper.selectByUsername(user.getUsername());
        if(u == null){
            mapper.add(user);
            sqlSession.commit();
        }
        sqlSession.close();
        return u == null;
    }

    public void changePassword(String username, String password){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.changePassword(username,password);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<User> selectAll() {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAllUer();
        sqlSession.close();
        return users;
    }

    public void delete(Integer identify) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(identify);
        sqlSession.commit();
        sqlSession.close();
    }

    public User selectUserByIdentify(int identify) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectUserByIdentify(identify);
        System.out.println(user);
        sqlSession.close();
        return user;
    }

    public void add1(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.add1(user);
        sqlSession.commit();
        sqlSession.close();
    }

    public void updateUser(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }

    public List<User> secletByconditon(User user){
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String username = user.getUsername();
        if(username !=null && username.length() > 0){
            user.setUsername("%" + username + "%");
        }
        Integer identify = user.getIdentify();
        if(identify !=0){
            user.setTel(Integer.valueOf(identify));
        }
        List<User> users = mapper.secletByCondition(user);
        sqlSession.close();
        return users;
    }



}
