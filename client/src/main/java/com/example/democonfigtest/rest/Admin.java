package com.example.democonfigtest.rest;

import com.alibaba.fastjson.JSONObject;
import com.example.democonfigtest.bean.JsonResult;
import com.example.democonfigtest.config.Config;
import com.example.democonfigtest.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {
    @Autowired
    private AdminDao adminDao;
    @Autowired
    private Config config;

    @RequestMapping(method = RequestMethod.GET, value = "/api/admin/{id}")
    public JsonResult<JSONObject> selectAdminById(@PathVariable Integer id){
        String name = config.getName();
        System.out.println(name);
        return JsonResult.success(adminDao.selectAdminById(id));
    }

}
