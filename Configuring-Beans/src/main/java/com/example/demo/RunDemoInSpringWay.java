package com.example.demo;

import com.example.demo.entity.Game;
import com.example.demo.entity.Team;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunDemoInSpringWay {
    public static void main(String[] args){
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       
        Team royals = context.getBean("royals",Team.class);

        Game game1 = context.getBean("game",Game.class);
        System.out.println(game1);
        
        Game game2 = context.getBean("game",Game.class);
        game2.setAwayTeam(royals);
        System.out.println(game2);        
        
        System.out.println(game1);
    }
}
