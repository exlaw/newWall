package com.example.demo.entity;

import java.util.ArrayList;

public class user {
    private int id;
    private String name;
    private int schoolNumber;
    private ArrayList<question> questions;
    private ArrayList<answer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public ArrayList<question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<question> questions) {
        this.questions = questions;
    }

    public ArrayList<answer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+schoolNumber;
    }
}
