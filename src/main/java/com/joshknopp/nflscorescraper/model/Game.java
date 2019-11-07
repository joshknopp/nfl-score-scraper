package com.joshknopp.nflscorescraper.model;

public class Game {
	private Long id;
	private Team awayTeam;
	private Team homeTeam;
	private boolean isUpcoming;
	private boolean isInProgress;
	private boolean isSuspended;
	private boolean isOver;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Team getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Team getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	public boolean isUpcoming() {
		return isUpcoming;
	}
	public void setUpcoming(boolean isUpcoming) {
		this.isUpcoming = isUpcoming;
	}
	public boolean isInProgress() {
		return isInProgress;
	}
	public void setInProgress(boolean isInProgress) {
		this.isInProgress = isInProgress;
	}
	public boolean isSuspended() {
		return isSuspended;
	}
	public void setSuspended(boolean isSuspended) {
		this.isSuspended = isSuspended;
	}
	public boolean isOver() {
		return isOver;
	}
	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}
}


/*
{
				"id": 2019080860,
				"awayTeam": {
					"abbr": "NYJ",
					"hasPosession": false,
					"identifier": "Jets",
					"teamId": "3430",
					"points": 6,
					"scores": {
						"pointTotal": 6,
						"pointQ1": 6,
						"pointQ2": 0,
						"pointQ3": 0,
						"pointQ4": 0,
						"pointOT": 0,
						"timeoutsRemaining": 3
					},
					"record": {
						"abbr": "NYJ",
						"wins": 0,
						"losses": 0,
						"ties": 0
					}
				},
				"homeTeam": {
					"abbr": "NYG",
					"hasPosession": false,
					"identifier": "Giants",
					"teamId": "3410",
					"points": 7,
					"scores": {
						"pointTotal": 7,
						"pointQ1": 7,
						"pointQ2": 0,
						"pointQ3": 0,
						"pointQ4": 0,
						"pointOT": 0,
						"timeoutsRemaining": 3
					},
					"record": {
						"abbr": "NYG",
						"wins": 0,
						"losses": 0,
						"ties": 0
					}
				},
				"status": {
					"currentGameTime": "SUSPENDED",
					"down": 1,
					"gameDate": "08/08/2019",
					"gameLink": "/gamecenter/2019080860/2019/PRE1/jets@giants",
					"gameTimeEastern": "19:00:00",
					"isHalf": false,
					"isInProgress": false,
					"isInProgressOvertime": false,
					"isOver": false,
					"isOverOvertime": false,
					"isPregame": false,
					"isRedZone": false,
					"isSuspended": true,
					"isUpcoming": false,
					"phaseDescription": "SUSPENDED",
					"time": "01:23",
					"upcomingGameTimeEastern": "Thu, 7:00 pm ET",
					"upcomingGameFullTimeEastern": "Thu, 7:00 pm ET",
					"week": 1,
					"gameType": "PRE",
					"yardsToGo": 10
				}
			}
*/