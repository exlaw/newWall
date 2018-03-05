package com.example.demo.service;

import com.example.demo.dao.memberdao;
import com.example.demo.dao.teamDao;
import com.example.demo.entity.member;
import com.example.demo.entity.team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class teamService {
    @Autowired
    memberdao memberdao;

    @Autowired
    teamDao teamDao;

    public void addTeam(team team){
        teamDao.addTeam(team);


        int number=team.getId();
        System.out.println("获得的ID是"+number);
        for(member member:team.getMembers()){
            member.setTeamID(Integer.toString(number));
            memberdao.addMember(member);
        }

    }
    public ArrayList<team> showTeam(){
        return teamDao.getTeam();
    }

}
