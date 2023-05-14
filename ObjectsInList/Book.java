package ObjectsInList;

public class Book {
    private String title;
    private Integer pages;
    private Integer year;

    public Book(String title, Integer pages, Integer year) {
        this.title = title;
        this.pages= pages;
        this.year =  year;
    }
    public Book (String title){
        this.title = title;
    }
    public Book (Integer pages, Integer year){
        this.pages = pages;
        this.year = year;
    }
    public String getName(){
        return title;
    }
    public Integer getEpisodes(){
        return pages;
    }
    public Integer getGenre(){
        return year;
    }
    public String toString (){
        return  this.title + ", " + this. pages + " ," + this.year ;
    }
}