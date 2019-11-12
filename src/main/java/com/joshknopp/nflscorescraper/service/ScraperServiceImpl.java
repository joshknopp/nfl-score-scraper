package com.joshknopp.nflscorescraper.service;

import java.io.IOException;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScraperServiceImpl implements ScraperService {
    @Autowired
    HtmlScoresService htmlScoresService;

	@Override
	public String getScores() throws IOException {
        Document doc = htmlScoresService.getScoresHtmlDoc();
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
		int beginIndex = dataClob.indexOf(arrayStartString) + arrayStartString.length();
		int endIndex = dataClob.indexOf(arrayEndString, beginIndex);
		return dataClob.substring(beginIndex, endIndex);
	}
}
