package com.lbh.service;

import com.lbh.dao.UserDao;
import com.lbh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Advancer on 2018/1/19 10:59.
 * auth: lbh
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 新增一条记录
     * @param name
     * @param age
     * @param money
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public int addUser(String name, String age, double money){
        return userDao.addUser(name, age, money);
    }

    /**
     * 更新一条记录
     * @param name
     * @param age
     * @param money
     * @param id
     * @return
     */
    public int updUser(String name, String age, double money, int id){
        return userDao.updUser(name, age, money, id);
    }

    /**
     * 删除一条记录
     * @param id
     * @return
     */
    public int delUser(int id){
        return userDao.delUser(id);
    }

    /**
     * 获取所有信息
     * @return
     */
    public List<User> findAllUser(){
        return userDao.findAllUser();
    }

    /**
     * 获取一条信息
     * @param id
     * @return
     */
    public User findUserById(int id){
        return userDao.findUserById(id);
    }

}
