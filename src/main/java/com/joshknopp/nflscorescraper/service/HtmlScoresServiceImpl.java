package com.joshknopp.nflscorescraper.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class HtmlScoresServiceImpl implements HtmlScoresService {
	@Override
	public Document getScoresHtmlDoc() throws IOException {
        Document doc = Jsoup.connect("https://www.nfl.com/scores").get();
        return doc;
    }
}
