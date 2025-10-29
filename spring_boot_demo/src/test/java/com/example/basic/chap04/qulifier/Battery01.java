package com.example.basic.chap04.qulifier;

import org.springframework.stereotype.Component;

@Component("베터리")
public class Battery01 implements IBattery {

    public String getInfo() { return "베터리"; }
}
