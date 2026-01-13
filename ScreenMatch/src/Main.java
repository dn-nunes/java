import br.com.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setName("O Preço do Amanhã");
        movie.setReleaseYear(2012);
        movie.setInPlusPack(false);

        movie.rate(2.5);
        movie.rate(8);

        movie.displaysTechnicalSheet();

    }
}
