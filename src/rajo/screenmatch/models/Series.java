package rajo.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesBySeason;
    private Boolean active;
    private int minutesByEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public int getDuration() {
        return seasons * episodesBySeason * minutesByEpisode;
    }
}
