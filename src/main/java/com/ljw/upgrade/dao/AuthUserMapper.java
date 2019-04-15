package com.ljw.upgrade.dao;

import com.ljw.upgrade.pojo.AuthUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AuthUserMapper {

    @Delete("delete from auth_user where id = #{id}")
    int deleteByPrimaryKey(String id);

    @Insert("insert into auth_user(id,age,name,sex,jiguan) values(#{id},#{age},#{name},#{sex},#{jiguan})")
    int insert(AuthUser record);

    @Select("select id,age,name,sex,jiguan from auth_user where id = #{id}")
    AuthUser selectByPrimaryKey(String id);

    @Select("select id,age,name,sex,jiguan from auth_user")
    List<AuthUser> selectAll();

    @Select("select id,age,name,sex,jiguan from auth_user where jiguan like concat('%',#{jiguan},'%')")
    List<AuthUser> select(@Param("jiguan") String jisuan);

    @Update("update auth_user set age=#{age},name=#{name},sex=#{sex},jiguan=#{jiguan} where id = #{id}")
    int updateByPrimaryKey(AuthUser record);

}