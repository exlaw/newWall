package com.example.demo.dao;

import com.example.demo.entity.question;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.sql.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class questionDaoTest {
    @Autowired
    questionDao questionDao;
    @Test
    public void addQuestion() {
      //  questionDao.addQuestion(new question("2","1","1","1",1
        //        ,"1",new Date(1)));
       ArrayList<question> questions =questionDao.getQuestionByUser(1);
       System.out.println(questions.get(0));
       System.out.println(questions.get(1));
    }
}