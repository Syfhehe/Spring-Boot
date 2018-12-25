package com.example.demo;

import com.example.demo.entity.Game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemoInSpringWay {
    public static void main(String[] args){
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Game game = context.getBean("game",Game.class);
        System.out.print(game.playGame());
        
        System.out.println(context.getBeanDefinitionCount());
        for (String string : context.getBeanDefinitionNames()) {
			System.out.println(string);
		}
    }
}
