package com.example.demo.dao;

import com.example.demo.entity.member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class memberdaoTest {
    @Autowired
    memberdao memberdao;
    @Test
    public void getMember() {
       memberdao.addMember(new member(5,"law","17125","2"));

    }
}