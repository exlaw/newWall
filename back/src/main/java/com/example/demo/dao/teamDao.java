package com.example.demo.dao;

import com.example.demo.entity.member;
import com.example.demo.entity.team;

import java.util.ArrayList;

public interface teamDao {
    public ArrayList<team> getTeam();
    public int addTeam(team t);
}
