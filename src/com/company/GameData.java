package com.company;

import java.util.ArrayList;

public class GameData {

        public static void main(String[] args) {

            new AradeGame(1,"Pac-Man", "1980", 400000, 3.5, 10.9);

            String PlayStation4GameData = args[0];
            PlayStation4Game.read(PlayStation4GameData);

            Game.describeAll();
        }

}
