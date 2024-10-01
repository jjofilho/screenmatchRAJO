import rajo.screenmatch.calcs.RecomendationFilter;
import rajo.screenmatch.calcs.TimeCalcs;
import rajo.screenmatch.models.Episodes;
import rajo.screenmatch.models.Movies;
import rajo.screenmatch.models.Series;

public class Principal {
    public static void main(String[] args) {

        Movies chefao = new Movies();
        chefao.setName("O Poderoso Chefão");
        chefao.setReleaseYear(1970);
        chefao.setDuration(120);
        chefao.setIncludedPlan(true);
        chefao.assessment(8.5);
        chefao.assessment(10.0);
        chefao.assessment(7.8);
        chefao.showTechnicalDataSheet();
        System.out.println("Duration: " + chefao.getDuration());


        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2010);
        lost.setSeasons(10);
        lost.setEpisodesBySeason(10);
        lost.setMinutesByEpisode(50);
        lost.assessment(9.0);
        lost.assessment(6.0);
        lost.assessment(9.5);
        lost.showTechnicalDataSheet();
        System.out.println("Duration: " + lost.getDuration());

        Movies avatar2 = new Movies();
        avatar2.setName("Avatar 2");
        avatar2.setReleaseYear(2023);
        avatar2.setDuration(200);

        TimeCalcs calculadora = new TimeCalcs();
        calculadora.include(chefao);
        calculadora.include(avatar2);
        calculadora.include((lost));
        System.out.println(calculadora.getTotalTime());

        RecomendationFilter filtro = new RecomendationFilter();
        filtro.filter(avatar2);

        Episodes episodioLost1 = new Episodes();
        episodioLost1.setNumber(1);
        episodioLost1.setSerie(lost);
        episodioLost1.setTotalViews(250);
        filtro.filter(episodioLost1);
    }
}
