package ru.spring.springApp2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CarShop carShop = context.getBean("carShop", CarShop.class);

        carShop.ShowCost();

        context.close();
    }
}
