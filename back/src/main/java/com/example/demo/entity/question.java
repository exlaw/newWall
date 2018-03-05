package com.example.demo.entity;

import java.util.ArrayList;
import java.sql.Date;

public class question {
    private String id;
    private String tags;
    private String title;
    private String content;
    private int userID;
    private String abs;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public question(String id, String tags, String title, String content, int userID, String abs, Date date) {
        this.id = id;
        this.tags = tags;
        this.title = title;
        this.content = content;
        this.userID = userID;
        this.abs = abs;
        this.date = date;
    }

    @Override
    public String toString() {
        return id+" "+tags+" "+date;
    }
}
