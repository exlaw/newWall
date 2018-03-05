package com.example.demo.dao;

import com.example.demo.entity.user;
import org.apache.ibatis.annotations.Select;

public interface userdao {
    public user getUser();
}
