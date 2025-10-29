package com.example.basic.chap04.qulifier;

import org.springframework.stereotype.Component;

@Component("빳데리")
public class Battery02 implements IBattery {
    public String getInfo() { return "빳데리"; }
}
