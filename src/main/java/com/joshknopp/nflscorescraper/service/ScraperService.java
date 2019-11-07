package com.joshknopp.nflscorescraper.service;

import java.io.IOException;

public interface ScraperService {
	public abstract String getScores() throws IOException;
	public abstract String getFinalScores() throws Exception;
	public abstract String getActiveScores() throws Exception;
	public abstract String getUpcomingScores() throws Exception;
}
