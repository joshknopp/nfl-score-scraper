package com.joshknopp.nflscorescraper.controller;

import org.springframework.web.bind.annotation.RestController;

import com.joshknopp.nflscorescraper.service.ScraperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

@RestController
public class ScoresController {
	@Autowired
	ScraperService scraperService;

    @RequestMapping("/")
    public String index() {
        return "Who Dey!";
    }

    @RequestMapping(value = "/scores", method = RequestMethod.GET, produces = "application/json")
    public String scores() throws IOException {
        return scraperService.getScores();
    }

}
