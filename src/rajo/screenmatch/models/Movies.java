package rajo.screenmatch.models;
import rajo.screenmatch.calcs.Rating;

public class Movies extends Title implements Rating {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) getAssessmentMean() / 2;
    }
}
