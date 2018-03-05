package com.example.demo.controller;

import com.example.demo.entity.team;
import com.example.demo.entity.temp;
import com.example.demo.service.teamService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    @Autowired
    teamService teamService;
    @RequestMapping("/get")
    public String showTeam(){
        return new Gson().toJson(teamService.showTeam());
    }

    @PostMapping("/put")
    public void addTeam( @RequestBody String in_s){
        System.out.println(in_s==null);
        System.out.println(in_s);
        temp temp=new Gson().fromJson(in_s, com.example.demo.entity.temp.class);
        team team=temp.param;
        teamService.addTeam(team);
    }
}
