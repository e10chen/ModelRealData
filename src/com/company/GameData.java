package com.company;

public class GameData {

        public static void main(String[] args) {

            AradeGame aradeGame1 = new AradeGame(1,"Pac-Man", "1980", 400000, 3.5, 10.9);
            PlayStation4Game consoleGame1 = new PlayStation4Game(1,"Grand Theft Auto V", "November 18, 2014", 20, "Action Adventure", "Rockstar North", "Rockstar Games");

            System.out.println(aradeGame1.toString());
            System.out.println(consoleGame1.toString());
        }

}
