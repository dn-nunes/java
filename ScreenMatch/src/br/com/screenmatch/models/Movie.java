package br.com.screenmatch.models;

// abstraction
public class Movie {
    private String name;
    private int releaseYear;
    private boolean inPlusPack;
    private double totalRating;
    private int amoutRating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isInPlusPack() {
        return inPlusPack;
    }

    public void setInPlusPack(boolean inPlusPack) {
        this.inPlusPack = inPlusPack;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public int getAmoutRating() {
        return amoutRating;
    }


    public void displaysTechnicalSheet() {
        System.out.printf("""
                Nome: %s
                Ano de lançamento: %d
                Filme plus: %b
                Avaliações: %.1f
                """, name, releaseYear, inPlusPack, calculateAverage());
    }
    public void rate(double rate) {
        totalRating += rate;
        amoutRating++;
    }
    double calculateAverage() {
        return totalRating / amoutRating;
    }
}
