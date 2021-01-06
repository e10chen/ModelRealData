package com.company;

public class PlayStation4Game extends Game {

    private String genre;
    private String developer;
    private String publisher;


    public PlayStation4Game(int rank, String title, String releaseDate, long copiesSold, String genre, String developer, String publisher) {
        super(rank, title, releaseDate, copiesSold);
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

}
