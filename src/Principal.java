import rajo.screenmatch.models.Films;

public class Principal {
    public static void main(String[] args) {
        Films movie = new Films();
        movie.setName("O Poderoso Chefão");
        movie.setReleaseYear(1970);
        movie.setDurationMovie(120);
        movie.setIncludedPlan(true);

        movie.showTechnicalDataSheet();
        movie.assessment(8.5);
        movie.assessment(10.0);
        movie.assessment(7.8);

        System.out.println("Média das Avaliações: " + movie.getAssessmentMean());
    }
}
