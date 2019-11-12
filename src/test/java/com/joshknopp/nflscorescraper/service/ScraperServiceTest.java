package com.joshknopp.nflscorescraper.service;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joshknopp.nflscorescraper.model.Game;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.ResourceUtils;

class ScraperServiceTest {
    @InjectMocks
    ScraperServiceImpl scraperService;

    @Mock
    HtmlScoresService htmlScoresService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @Ignore
	void testGetScores() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void testGetFinalScores() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void testGetActiveScores() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void testGetUpcomingScores() {
		fail("Not yet implemented");
	}

	/* *** */

	@Test
	void testGetFinalScores08092355ShouldReturnTenOverPhi() throws IOException {
        // TODO Move the URL/local file fethc logic into one or more utils
        URL resourceUrl = this.getClass().getResource("../../../../2019-08-09 23-55 nfl.com.html");
        File input = ResourceUtils.getFile(resourceUrl);
        System.out.println("Test file " + input.getAbsolutePath());
        Document doc = Jsoup.parse(input, "UTF-8", "https://www.nfl.com/scores");
        when(htmlScoresService.getScoresHtmlDoc()).thenReturn(doc);
        // Setup JSON read
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Game>> typeReference = new TypeReference<List<Game>>(){};
        // TODO Extract the JSON block from file content before trying to map
        List<Game> games = mapper.readValue(input,typeReference);
	}

	@Test
    @Ignore
	void getUpcomingScores08081950ShouldReturnTbAtPit() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void getInProgressScores08081950ShouldReturnJaxAtBal() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void getInProgressScores08081950ShouldReturnJaxAtBalHomeLeading() {
		fail("Not yet implemented");
	}

	@Test
    @Ignore
	void getActiveScores08081950ShouldReturnNyjAtNygSuspended() {
		fail("Not yet implemented");
	}

}
