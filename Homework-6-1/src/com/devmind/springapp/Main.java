package com.devmind.springapp;

import com.devmind.springapp.abs.ITeacher;
import com.devmind.springapp.impl.JavaTeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ITeacher teacher = context.getBean("mathTeacher", ITeacher.class);

        JavaTeacher javaTeacher = context.getBean("javaTeacher", JavaTeacher.class);

        System.out.println(teacher.getWisdom());
        System.out.println(teacher.getHomeWork());

        System.out.println(javaTeacher.getHomeWork());
        System.out.println(javaTeacher.getWisdom());
        System.out.println("Java teacher age: " + javaTeacher.getAge());
        System.out.println("Java teacher workplace: " + javaTeacher.getWorkPlace());
        System.out.println("Java teacher object: " + javaTeacher);
        System.out.println("Java teacher hashcode: " + javaTeacher.hashCode());

        context.close();
    }
}