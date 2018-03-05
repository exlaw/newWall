package com.example.demo.dao;

import com.example.demo.entity.team;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class teamDaoTest {

    @Autowired
    teamDao teamDao;
    @Test
    public void getTeam() {
      ArrayList<team> teams= teamDao.getTeam();
        System.out.println(teams.get(0));
       // teamDao.addTeam(new team(2,"hhh","17125"));
    }
}