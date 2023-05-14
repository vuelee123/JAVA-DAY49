package ObjectsInList;

public class TvShow {
    private String showName;
    private String genre;
    private Integer numberOfEpisodes;

    public TvShow (String showName, String genre, Integer numberOfEpisodes) {
        this.showName = showName;
        this.genre = genre;
        this.numberOfEpisodes = numberOfEpisodes;
    }
    public TvShow (String showName) {
        this.showName = showName;
    }

    public TvShow(String genre, Integer numberOfEpisodes) {
        this.genre = genre;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getName () {
        return showName;
    }
    public String getGenre() {
        return genre;
    }
    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }
    public String toString (){
        return "The name of the show is " + showName + " with " + numberOfEpisodes + " episodes. The genre is " + genre + ".";
    }
}
