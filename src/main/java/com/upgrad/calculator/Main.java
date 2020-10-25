package com.upgrad.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.upgrad.calculator");
        Calculator calculator=(Calculator)applicationContext.getBean("calculator");
        Scanner input=new Scanner(System.in);
        System.out.println("enter operation and two numbers");
        String operation=input.next();
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("result="+calculator.compute(operation,a,b));
    }
}
