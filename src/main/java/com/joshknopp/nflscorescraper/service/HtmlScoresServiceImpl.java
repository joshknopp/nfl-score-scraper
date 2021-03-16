package com.joshknopp.nflscorescraper.service;

import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

@Service
public class HtmlScoresServiceImpl implements HtmlScoresService {
	@Override
	public Document getScoresHtmlDoc() throws IOException {
        Document doc = Jsoup.connect("https://www.nfl.com/scores").get();
        return doc;
    }
}
