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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


@Override
    public String toString() {


    return null;
};

}
