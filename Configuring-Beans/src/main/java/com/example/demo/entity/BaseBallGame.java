package com.example.demo.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public class BaseBallGame implements Game  {

    private Team homeTeam;
    private Team awayTeam;
    private DataSource dataSource;
    
    public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public BaseBallGame(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

	@PostConstruct
	public void startGame()	{
		System.out.println("Start game.");
	}
	
	@PreDestroy
	public void endGame()	{
		System.out.println("Game ended.");
	}
	
    public BaseBallGame() {
    }

    @Override
    public Team getHomeTeam() {
        return homeTeam;
    }

    @Override
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public Team getAwayTeam() {
        return awayTeam;
    }

    @Override
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String playGame(){
        return Math.random()<0.5? getHomeTeam().getName():getAwayTeam().getName();
    }

	@Override
	public String toString() {
		return "BaseBallGame [homeTeam=" + homeTeam.getName() + ", awayTeam=" + awayTeam.getName() + "]";
	}
    
    
}
