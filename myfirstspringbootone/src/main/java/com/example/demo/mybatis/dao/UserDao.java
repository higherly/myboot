package com.example.demo.mybatis.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/5/21.
 */
public interface UserDao {
    public List<Map<String,Object>> get();
}
