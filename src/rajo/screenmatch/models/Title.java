package rajo.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedPlan;
    private double assessmentSum;
    private int assessmentTotal;
    private int duration;

    public void showTechnicalDataSheet() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + releaseYear);
        System.out.println("Included Plan: " + includedPlan);
        System.out.println("Assessment Mean: " + getAssessmentMean());
    }

    public void assessment(double note) {
        assessmentSum += note;
        assessmentTotal ++;
    }

    public double getAssessmentMean() {
        return assessmentSum / assessmentTotal;
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

    public void setDuration(int duration) {
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public double getAssessmentSum() {
        return assessmentSum;
    }

    public int getAssessmentTotal() {
        return assessmentTotal;
    }
}
