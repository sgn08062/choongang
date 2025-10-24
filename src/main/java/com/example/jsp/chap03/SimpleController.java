package com.example.jsp.chap03;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Date;

public class SimpleController implements HandlerController {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Date date = new Date();
        request.setAttribute("date", date);
        return "simple.jsp";
    }
}
