package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PlayStation4Game extends Game {

    private String genre;
    private String developer;
    private String publisher;


    public PlayStation4Game(int rank, String title, String releaseDate, double copiesSold, String genre, String developer, String publisher) {
        super(rank, title, copiesSold, releaseDate);
        this.genre = genre;
        this.developer = developer;
        this.publisher = publisher;
    }

     String getGenre() {
        return genre;
    }

     void setGenre(String genre) {
        this.genre = genre;
    }

     String getDeveloper() {
        return developer;
    }

     void setDeveloper(String developer) {
        this.developer = developer;
    }

     String getPublisher() {
        return publisher;
    }

     void setPublisher(String publisher) {
        this.publisher = publisher;
    }


@Override

    public String toString() {


    return "\"" + getTitle() + "\" had a rank of #" + getRank() + ". It is a " + getGenre() + " game that was developed by the " + getDeveloper() + "and publish by the" + getPublisher() + ".  It was release on " + getReleaseDate() + " and sold up to " + getCopiesSold() + " million copies.";
}

    static void read(String playStation4GameData) {
        Scanner scanner = null;
        try {
            File file = new File(playStation4GameData);
            scanner = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problem oping file: " + playStation4GameData);
        }
        if (scanner == null) {

            return;
        }

    while (scanner.hasNext()) {
        String next = scanner.nextLine();
        Scanner lineScanner = new Scanner(next);
        lineScanner.useDelimiter("\t");

        int ranking = lineScanner.nextInt();
        String title = lineScanner.next();
        String releaseDate = lineScanner.next();
        double copiesSold = lineScanner.nextDouble();
        String genres = lineScanner.next();
        String developers = lineScanner.next();
        String publishers = lineScanner.next();

        Game game = new PlayStation4Game(ranking, title, releaseDate, copiesSold, genres, developers, publishers);
    }

    }



}
