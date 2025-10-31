package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacher teacher = context.getBean("myTeacher", ITeacher.class);

        JavaTeacher mathTeacher = context.getBean("myTeacher", JavaTeacher.class);

        System.out.println(teacher.getWisdom());
        System.out.println(teacher.getHomeWork());

        System.out.println(mathTeacher.getHomeWork());
        System.out.println(mathTeacher.getWisdom());
        System.out.println(mathTeacher.getAge());
        System.out.println(mathTeacher.getWorkPlace());

        context.close();
    }
}

