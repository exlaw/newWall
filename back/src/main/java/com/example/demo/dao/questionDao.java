package com.example.demo.dao;

import com.example.demo.entity.question;

import java.util.ArrayList;

public interface questionDao {
    public boolean addQuestion(question question);
    public boolean updateQuestion(question question);
    public boolean deleteQuestion(String questionID);
    public ArrayList<question> getQuestionByUser(int userID);
}
