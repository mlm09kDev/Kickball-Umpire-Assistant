package com.pyrotemplar.refereehelper.Utils;

import java.io.Serializable;

/**
 * Created by Manuel Montes de Oca on 4/26/2017.
 */

public class GameCountState implements Serializable {

    private int awayTeamScore;
    private int homeTeamScore;
    private int strikeCount;
    private int ballCount;
    private int foulCount;
    private int outCount;
    private int inning;
    private boolean botOfInning;

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public void setStrikeCount(int strikeCount) {
        this.strikeCount = strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void setBallCount(int ballCount) {
        this.ballCount = ballCount;
    }

    public int getFoulCount() {
        return foulCount;
    }

    public void setFoulCount(int foulCount) {
        this.foulCount = foulCount;
    }

    public int getOutCount() {
        return outCount;
    }

    public void setOutCount(int outCount) {
        this.outCount = outCount;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }


    public boolean isBotOfInning() {
        return botOfInning;
    }

    public void setBotOfInning(boolean botOfInning) {
        this.botOfInning = botOfInning;
    }
}