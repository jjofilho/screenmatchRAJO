public class Principal {
    public static void main(String[] args) {
        Films meuFilme = new Films();
        meuFilme.name = "O Poderoso Chefão";
        meuFilme.releaseYear = 1970;
        meuFilme.durationMovie = 120;

        meuFilme.showTechnicalDataSheet();
        meuFilme.assessment(8.5);
        meuFilme.assessment(10.0);
        meuFilme.assessment(7.8);

        System.out.println(meuFilme.assessmentMoviesSum);
        System.out.println(meuFilme.assessmentTotal);
        System.out.println(meuFilme.getAssementMean());

    }
}
