package com.joshknopp.nflscorescraper.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.PostConstruct;

import com.joshknopp.nflscorescraper.service.ScraperService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
