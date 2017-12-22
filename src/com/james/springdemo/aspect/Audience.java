package com.james.springdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {

    /*@Pointcut注解定义切入点*/
@Pointcut("execution(** com.james.springdemo.performance.Concert.perform(..))")
public void performance(){}

@Before("performance()")
    public void silent(){
        System.out.println("be quiet");
    }

    @Before("performance()")
    public void makeSomeNoise(){
        System.out.println("make some noise!");
    }

    @After("performance()")
    public void clap(){
        System.out.println("wonderful!");
    }
}
