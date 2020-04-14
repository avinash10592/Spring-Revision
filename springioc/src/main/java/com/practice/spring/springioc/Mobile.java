package com.practice.spring.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Mobile 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       System.out.println("Config loaded");
       
       Sim sim = context.getBean("sim",Sim.class);
       sim.calling();
       sim.data();
    }
}
