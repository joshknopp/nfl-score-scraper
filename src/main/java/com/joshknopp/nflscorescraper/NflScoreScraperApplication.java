package com.joshknopp.nflscorescraper;

import com.joshknopp.nflscorescraper.controller.ScoresController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NflScoreScraperApplication {
    @Autowired
    ScoresController scoresController;

	public static void main(String[] args) {
        SpringApplication.run(NflScoreScraperApplication.class, args);
	}

}
