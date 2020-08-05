package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.SoccerService;

@SpringBootApplication
public class SpringBootJpaHibernateMySqlApplication {

	
	@Autowired
	SoccerService soccerService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaHibernateMySqlApplication.class, args);
	}

	public void run(String... arg0) throws Exception {
		
		soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
		
		List<String> players = soccerService.getAllTeamPlayers(1);
		for(String player : players)
		{
			System.out.println("Introducing Barca player => " + player);
		}
	}
}
