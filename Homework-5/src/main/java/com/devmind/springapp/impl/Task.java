package com.devmind.springapp.impl;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {
    private static int numberOfTasks = 0;
    private static final AtomicInteger taskId = new AtomicInteger(-1);
    private String taskName;
    private int executionTime;
    private final Random random = new Random();

    public void run() {
        try {
            System.out.println(taskName + " started... execution time in : " + executionTime + " seconds");
            Thread.sleep(executionTime * 1000L);
            System.out.println(taskName + " finished after " + executionTime + " seconds.");
        } catch (InterruptedException e) {
            System.out.println("Task was interrupted!");
        }
    }

    private static Integer generateId() {
        return taskId.getAndIncrement();
    }

    private void init() {
        numberOfTasks++;
        generateId();
        taskName = "Task" + taskId;
        executionTime = random.nextInt(19) + 1;
        System.out.println("\n" + taskName + " was created.");
    }

    private void destroy() {
        System.out.println(taskName + " was destroyed.");
        numberOfTasks--;
    }

    public static int getTotalTasks() {
        return numberOfTasks;
    }
}
