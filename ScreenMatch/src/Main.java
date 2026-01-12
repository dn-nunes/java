public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "O Preço do Amanhã";
        movie.releaseYear = 2012;
        movie.inPlusPack = false;

        movie.rate(2.5);
        movie.rate(8);

        movie.displaysTechnicalSheet();

    }
}
