package com.joshknopp.nflscorescraper.service;

import java.io.IOException;

public interface ScraperService {
	public abstract String getScores() throws IOException;
}
