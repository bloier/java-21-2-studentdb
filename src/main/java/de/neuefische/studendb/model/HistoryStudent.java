package de.neuefische.studendb.model;

public class HistoryStudent extends Student{

    private String favouriteYear;

    public HistoryStudent(String name, String id) {
        super(name, id);
    }

    public String getFavouriteYear() {
        return favouriteYear;
    }

    public void setFavouriteYear(String favouriteYear) {
        this.favouriteYear = favouriteYear;
    }

}
