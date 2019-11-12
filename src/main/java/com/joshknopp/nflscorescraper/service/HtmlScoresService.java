package com.joshknopp.nflscorescraper.service;

import java.io.IOException;

import org.jsoup.nodes.Document;

public interface HtmlScoresService {
	public abstract Document getScoresHtmlDoc() throws IOException;
}
