package com.example.demo;

import com.example.demo.entity.*;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.example.demo")
public class AppConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private List<Team> teams;
    
	//scope default singleton
	@Bean @Scope("prototype")
    public Game game(){
        BaseBallGame baseBallGame = new BaseBallGame(teams.get(0), teams.get(1));
        baseBallGame.setDataSource(dataSource);
		return baseBallGame;
    }

}
