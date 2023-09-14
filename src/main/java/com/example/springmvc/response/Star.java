package com.example.springmvc.response;
import lombok.*;

@Getter
//@Setter
public class Star {
    String name;
    int age;

    public Star(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //기본생성자
    public Star() {}
}