package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AradeGame extends Game {

    private double revenueWithoutInflation;
    private double revenueWithInflation;

    AradeGame(int rank, String title, String releaseDate, double copiesSold, double revenueWithoutInflation, double revenueWithInflation) {
        super(rank, title, copiesSold, releaseDate);
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

        return "\"" + getTitle() + "\" had a rank of #" + getRank() + " released on " + getReleaseDate() + " sold up to " + getCopiesSold() + " hardware units. Without inflation up to 1999 it made "+ getRevenueWithoutInflation() + " billion dollars and with 2019 inflation it made "+ getRevenueWithInflation() +" billion dollars.";

    }




}
