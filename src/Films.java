public class Films {
    String name;
    int releaseYear;
    boolean includedPlan;
    double assessmentMoviesSum;
    int assessmentTotal;
    int durationMovie;

    void showTechnicalDataSheet() {
        System.out.println("Movie Name: " + name);
        System.out.println("Release Year: " + releaseYear);
    }

    void assessment(double note) {
        assessmentMoviesSum += note;
        assessmentTotal ++;
    }

    double getAssementMean() {
        return assessmentMoviesSum / assessmentTotal;
    }
}
