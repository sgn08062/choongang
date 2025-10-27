package com.example.basic.chap01.command;

import java.util.Arrays;

// Value Object = 값을 저장하는 용도의 클래스
public class ReqVO {
    // 멤버 변수는 은닉하고
    // getter, setter를 생성함
    private String id;
    private String pw;
    private String name;
    private String[] inter;

    // 생성자는 기본 생성자, 멤버 변수 개수만한 생성자. 총 2개 생성

    public ReqVO() {}

    public ReqVO(String id, String pw, String name, String[] inter) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.inter = inter;
    }

    // getter, setter
    public String getId() {
        return id;
    }

    public String[] getInter() {
        return inter;
    }

    public String getpw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setInter(String[] inter) {
        this.inter = inter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "ReqVO{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", inter=" + Arrays.toString(inter) +
                '}';
    }
}
