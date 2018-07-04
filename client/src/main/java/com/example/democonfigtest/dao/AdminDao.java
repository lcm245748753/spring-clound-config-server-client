package com.example.democonfigtest.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminDao {
    JSONObject selectAdminById(Integer id);
}
