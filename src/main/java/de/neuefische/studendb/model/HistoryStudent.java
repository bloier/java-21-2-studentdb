package de.neuefische.studendb.model;

import java.util.Objects;

public class HistoryStudent implements Student {

    private String name;
    private String id;
    private int grade;

    public HistoryStudent(String name, String id){
        this.name = name;
        this.id = id;
        this.grade = 0;
    }

    @Override
    public int calculateGradeAverage() {
        return 2;
    }

    @Override
    public int dropoutNumber() {
        return 0;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name + id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent student = (HistoryStudent) o;
        return Objects.equals(name, student.name) && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
