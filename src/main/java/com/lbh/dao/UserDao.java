package com.lbh.dao;

import com.lbh.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Advancer on 2018/1/19 10:52.
 * auth: lbh
 */
@Mapper
@Component
public interface UserDao {

    @Insert("INSERT INTO user(name, age, money) VALUES(#{name}, #{age}, #{money})")
    public int addUser(@Param("name") String name, @Param("age") String age, @Param("money") double money);

    @Update("UPDATE user SET name = #{name}, age = #{age}, money = #{money} WHERE id = #{id}")
    public int updUser(@Param("name") String name, @Param("age") String age, @Param("money") double money, @Param("id") int id);

    @Delete("DELETE FROM user WHERE id = #{id}")
    public int delUser(@Param("id") int id);

    /**
     * 与@Select 注解并用的注解还有一个 @Result，
     * @Restle:修饰返回的结果集，关联实体类属性与字段一一对应，如果实体类属性与字段名字保持一致，则不需要此属性也可以。
     * @return
     */
    @Select("SELECT id, name, age, money FROM user")
    public List<User> findAllUser();

    @Select("SELECT id, name, age, money FROM user WHERE id = #{id}")
    public User findUserById(@Param("id") int id);


}
