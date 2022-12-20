package com.example.lirui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lirui.pojo.UserLirui;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<UserLirui> {
    @Select("<script>SELECT COUNT(id) FROM [test].[user_lirui]  <where> <if test = \"name != null\">AND name LIKE #{name}</if> </where></script>")
    Integer selectCount(@Param("name") String name, @Param("userName") String userName, @Param("companyName") String companyName);
}
