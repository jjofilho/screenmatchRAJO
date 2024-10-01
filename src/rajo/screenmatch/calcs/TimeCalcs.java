package rajo.screenmatch.calcs;
import rajo.screenmatch.models.Title;

public class TimeCalcs {

    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include (Movies m) {
//        this.totalTime += m.getDuration();
//    }
//
//    public void include (Series s) {
//        this.totalTime += s.getDuration();
//    }

    public void include (Title titulo) {
        System.out.println("Adicionando o título " + titulo);
        this.totalTime += titulo.getDuration();
    }

}
