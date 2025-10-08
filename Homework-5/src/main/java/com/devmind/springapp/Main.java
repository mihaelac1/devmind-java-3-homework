package com.devmind.springapp;

import com.devmind.springapp.impl.Task;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.devmind.springapp.impl.Task.getTotalTasks;

public class Main {
    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Task pTask1 = context.getBean("prototypeTask", Task.class);
            pTask1.run();
            Task pTask2 = context.getBean("prototypeTask", Task.class);
            pTask2.run();

            Task sTask1 = context.getBean("singletonTask", Task.class);
            sTask1.run();
            Task sTask2 = context.getBean("singletonTask", Task.class);
            sTask2.run();

            System.out.println("Total tasks before destroy: " + getTotalTasks());
        }
        System.out.println("Total tasks after destroy: " + getTotalTasks());
    }
}
