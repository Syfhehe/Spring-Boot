package com.example.demo;

import com.example.demo.entity.Game;

import java.text.NumberFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunDemoInSpringWay {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Game game = context.getBean("game",Game.class);
//        System.out.print(game.playGame());
//        
//        System.out.println(context.getBeanDefinitionCount());
//        for (String string : context.getBeanDefinitionNames()) {
//			System.out.println(string);
//		}

		NumberFormat nf = context.getBean(NumberFormat.class);
		double amount = 12345.123412;
		System.out.println(nf.format(amount));

	}
}
