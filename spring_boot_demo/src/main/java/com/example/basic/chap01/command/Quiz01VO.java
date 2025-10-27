package com.example.basic.chap01.command;

public class Quiz01VO {
    String id;
    String pw;

    public Quiz01VO() {
    }
    public Quiz01VO(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
