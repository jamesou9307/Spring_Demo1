package com.james.springdemo.minstrel;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

@Aspect
public class Minstrel {

    private PrintStream stream;

    public Minstrel() {
    }

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public PrintStream getStream() {
        return stream;
    }

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }

    @Before("execution(** com.james.springdemo.entity.Knight.doQuest(..))")
    public void singBeforeQuest(){
        System.out.println("The knight is so brave!");
    }
    @After("execution(** com.james.springdemo.entity.Knight.doQuest(..))")
    public void singAfterQuest(){
        System.out.println("The knight finish the quest!");
    }

}
