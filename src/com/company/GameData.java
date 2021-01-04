package com.company;

public class GameData {

        public static void main(String[] args) {

            AradeGame aradeGame1 = new AradeGame(1,"Pac-Man", "1980", 400000, 3.5, 10.9);
            PlayStation4Game consoleGame1 = new PlayStation4Game(1,"Grand Theft Auto V", "November 18, 2014", 20, "Action Adventure", "Rockstar North", "Rockstar Games");

            System.out.println("\"" + aradeGame1.getTitle() + "\" had a rank of #" + aradeGame1.getRank() + " released on " + aradeGame1.getReleaseDate() + "sold up to " + aradeGame1.getCopiesSold() + "hardware units. Without inflation up to 1999 it made "+ aradeGame1.getRevenueWithoutInflation() + " billion dollars and with 2019 inflation it made "+ aradeGame1.getRevenueWithInflation() +" billion dollars.");
            System.out.println("\"" + consoleGame1.getTitle() + "\" had a rank of #" + consoleGame1.getRank() + ". It is a " + consoleGame1.getGenre() + " game that was developed by the " + consoleGame1.getDeveloper() + "and publish by the" + consoleGame1.getPublisher() + ".  It was release on " + consoleGame1.getReleaseDate() + " and sold up to " + consoleGame1.getCopiesSold() + " million copies.");
        }

}
