package com.example.demo;

import com.example.demo.entity.*;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Resource
	private Team redSox;
	
	@Resource
	private Team cubs;
    
	@Bean
    public Game game(){
        BaseBallGame baseBallGame = new BaseBallGame(redSox, cubs);
        baseBallGame.setDs(dataSource);
		return baseBallGame;
    }

}
