package rajo.screenmatch.models;

public class Films {
    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double assessmentMoviesSum;
    private int assessmentTotal;
    private int durationMovie;

    public void showTechnicalDataSheet() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Duração: " + durationMovie);
        System.out.println("Incluído no Plano: " + includedPlan);
    }

    public void assessment(double note) {
        assessmentMoviesSum += note;
        assessmentTotal ++;
    }

    public double getAssessmentMean() {
        return assessmentMoviesSum / assessmentTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedPlan(boolean includedPlan) {
        this.includedPlan = includedPlan;
    }

    public void setDurationMovie(int durationMovie) {
        this.durationMovie = durationMovie;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean getIncludedPlan() {
        return includedPlan;
    }

    public int getDurationMovie() {
        return durationMovie;
    }

    public double getAssessmentMoviesSum() {
        return assessmentMoviesSum;
    }

    public int getAssessmentTotal() {
        return assessmentTotal;
    }
}
