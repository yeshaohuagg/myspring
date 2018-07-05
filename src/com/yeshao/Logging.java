package com.yeshao;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
    @Pointcut("execution(* com.yeshao.*.*(..))")
    private void pointcut(){}
    @Before("pointcut()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile");
    }
    @After("pointcut()")
    public void afterAdvice(){
        System.out.println("Student profile has been setup");
    }
    @AfterReturning(pointcut = "pointcut()",returning = "retVal")
    public void afterReturningAdvice(Object retVal){
//        System.out.println("Returning:"+retVal.toString());
    }
    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void afterThrowingAdvice(IllegalArgumentException e){
        System.out.println("There has been an exception:"+e.toString());
    }
}
