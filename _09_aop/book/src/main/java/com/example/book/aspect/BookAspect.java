package com.example.book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    int count = 0;
    @Pointcut("within(com.example.book.controller.BookController)")
    public void aspect(){

    }
    @After("aspect()")
    public void afterAspect(JoinPoint joinPoint){
        System.err.printf("hanh dong " + joinPoint.getSignature().getName() + "so lan " + count);
        count ++;
    }

}
