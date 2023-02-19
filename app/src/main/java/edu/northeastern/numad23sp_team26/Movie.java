package edu.northeastern.numad23sp_team26;

public class Movie {
    private final String genre;
    private final String posterURL;
    private final String name;
    private final int year;
    private final String type;


    public Movie(String name, int year, String type, String posterURL) {
        this.genre = "comedy";
        this.posterURL = posterURL;
        this.name = name;
        this.type = type;
        this.year =year;
    }

    public String getGenre() {
        return this.genre;
    }
    public String getPosterURL() { return this.posterURL; }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }
    public String getType() { return this.type; }
}
