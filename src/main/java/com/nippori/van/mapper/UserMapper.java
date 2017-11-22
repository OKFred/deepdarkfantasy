package com.nippori.van.mapper;

import com.nippori.van.bean.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Caesar
 * on 2017-11-16.
 */
public interface UserMapper {
    @Select("SELECT * FROM EAUSER WHERE userid = #{id}")
    @Results({
            @Result(property = "username",  column = "username"),
            @Result(property = "account", column = "account")
    })
    User getOne(String id);

//    @Select("SELECT * FROM EAUSER WHERE userid = #{id}")
//    User getOne(String id);
}
