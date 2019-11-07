package com.joshknopp.nflscorescraper.service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException.NotImplemented;

@Service
public class ScraperServiceImpl implements ScraperService {
	@Override
	public String getScores() throws IOException {
        Document doc = Jsoup.connect("https://www.nfl.com/scores").get();
        Elements els = doc.select("script:containsData(__INITIAL_DATA__)");
        String dataClob = els.get(0).html();
        return getScoresArrayAsStringFromDataClob(dataClob);
    }

	@Override
	public String getFinalScores() throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getActiveScores() throws Exception {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getUpcomingScores() throws Exception {
		throw new UnsupportedOperationException();
	}

	private String getScoresArrayAsStringFromDataClob(String dataClob) {
		String arrayStartString = "scoreStripGames\":[";
		String arrayEndString = "]";
		String result = "";
		int beginIndex = dataClob.indexOf(arrayStartString) + arrayStartString.length();
		int endIndex = dataClob.indexOf(arrayEndString, beginIndex);
		return dataClob.substring(beginIndex, endIndex);
	}
}
