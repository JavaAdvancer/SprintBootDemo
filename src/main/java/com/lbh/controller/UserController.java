package com.lbh.controller;

import com.lbh.entity.User;
import com.lbh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Advancer on 2018/1/19 11:03.
 * auth: lbh
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("age") String age,
                          @RequestParam("money") double money){
        int flag = userService.addUser(name, age, money);
        if (flag == 1){
            return "success";
        }else {
            return "fail";
        }
    }

    @RequestMapping(value = "/updUser/{id}", method = RequestMethod.PUT)
    public String updUser(@RequestParam(value = "name", required = true) String name,
                          @RequestParam(value = "age", required = true) String age,
                          @RequestParam(value = "money", required = true) double money,
                          @PathVariable("id") int id){
        int flag = userService.updUser(name, age, money, id);
        if (flag == 1){
            return "success!";
        }else{
            return "fail";
        }
    }

    @RequestMapping("delUser/{id}")
    public String delUser(@PathVariable("id") int id){
        int flag = userService.delUser(id);
        if (flag == 1){
            return "success!";
        }else {
            return "fail";
        }
    }

    @RequestMapping("findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }


    @RequestMapping("findUserById/{id}")
    public User findUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }

}










