// abstraction
public class Movie {
    String name;
    int releaseYear;
    boolean inPlusPack;
    double totalRating;
    int amoutRating;

    void displaysTechnicalSheet() {
        System.out.printf("""
                Nome: %s
                Ano de lançamento: %d
                Filme plus: %b
                Avaliações: %.1f
                """, name, releaseYear, inPlusPack, calculateAverage());
    }
    void rate(double rate) {
        totalRating += rate;
        amoutRating++;
    }
    double calculateAverage() {
        return totalRating / amoutRating;
    }
}
