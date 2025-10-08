package com.devmind.springapp.abs;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyLoggingAspect {
    @Pointcut("execution(* com.devmind.springapp.impl.Task.run(..))")
    public void runMethod() {}

    @Before("runMethod()")
    public void logBeforeRun() {
        System.out.println("\n[LOG] run() method is about to be called.");
    }

    @After("runMethod()")
    public void logAfterRun() {
        System.out.println("[LOG] run() method has been executed.\n");
    }
}
