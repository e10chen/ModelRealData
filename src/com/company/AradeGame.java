package com.company;

public class AradeGame extends Game {

    private double revenueWithoutInflation;
    private double revenueWithInflation;

    AradeGame(int rank, String title, String releaseDate, double copiesSold, double revenueWithoutInflation, double revenueWithInflation) {
        super(rank, title, releaseDate, copiesSold);
        this.revenueWithoutInflation = revenueWithoutInflation;
        this.revenueWithInflation = revenueWithInflation;
    }

    double getRevenueWithoutInflation() {
        return revenueWithoutInflation;
    }

    void setRevenueWithoutInflation(long revenueWithoutInflation) {
        this.revenueWithoutInflation = revenueWithoutInflation;
    }

    double getRevenueWithInflation() {
        return revenueWithInflation;
    }

    void setRevenueWithInflation(long revenueWithInflation) {
        this.revenueWithInflation = revenueWithInflation;
    }


    public String toString() {

        return "\"" + title + "\" had a rank of #" + rank + " released on " + releaseDate + "sold up to " + copiesSold + "hardware units. Without inflation up to 1999 it made "+ revenueWithoutInflation + " billion dollars and with 2019 inflation it made "+ revenueWithInflation +" billion dollars.";

    }


}
