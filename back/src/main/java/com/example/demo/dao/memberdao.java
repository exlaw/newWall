package com.example.demo.dao;

import com.example.demo.entity.member;

import java.util.ArrayList;

public interface memberdao {
    public ArrayList<member> getMember();

    public int addMember(member member);
}
