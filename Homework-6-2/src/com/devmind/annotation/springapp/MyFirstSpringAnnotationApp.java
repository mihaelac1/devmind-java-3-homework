package com.devmind.annotation.springapp;

import com.devmind.annotation.springapp.abs.ITeacher;
import com.devmind.annotation.springapp.impl.JavaTeacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringAnnotationApp {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            ITeacher teacher = context.getBean("mathTeacher", ITeacher.class);

            JavaTeacher javaTeacher = context.getBean("javaTeacher", JavaTeacher.class);

            System.out.println(teacher.getWisdom());
            System.out.println(teacher.getHomeWork());

            System.out.println("\n" + javaTeacher.getHomeWork());
            System.out.println(javaTeacher.getWisdom());
            System.out.println("Java teacher age: " + javaTeacher.getAge());
            System.out.println("Java teacher workplace: " + javaTeacher.getWorkPlace());

            ITeacher historyTeacher = context.getBean(ITeacher.class);
            System.out.println("\n" + historyTeacher.getHomeWork());
            System.out.println(historyTeacher.getWisdom());
        }
    }
}