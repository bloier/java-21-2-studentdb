package de.neuefische.studendb.model;

import java.util.Objects;

public class MathStudent extends Student{

    private int favouriteNumber;

    public MathStudent(String name, String id, int favouriteNumber) {
        super(name, id);
        this.favouriteNumber = favouriteNumber;
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }

    public void setFavouriteNumber(int favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MathStudent that = (MathStudent) o;
        return favouriteNumber == that.favouriteNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), favouriteNumber);
    }
}
