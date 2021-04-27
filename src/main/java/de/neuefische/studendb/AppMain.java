package de.neuefische.studendb;

import de.neuefische.studendb.db.StudentDb;
import de.neuefische.studendb.model.HistoryStudent;
import de.neuefische.studendb.model.MathStudent;
import de.neuefische.studendb.model.Student;

public class AppMain {

    public static void main(String[] args) {
        /*Student[] students = new Student[]{
                new Student("Jane", "42"),
                new Student("Klaus", "13"),
                new Student("Franky", "100")
        };
        StudentDb studentDb = new StudentDb(students);

        for(int i=0; i < 5; i++){
            System.out.println(studentDb.randomStudent());
        }*/

        resultOfGradeMethod();

    }

    public static void resultOfGradeMethod() {
        Student[] allStudents = new Student[] {
                new HistoryStudent("Harry", "34"),
                new MathStudent("Hermione", "71")
        };
        for (Student s : allStudents) {
            System.out.println(s.calculateGradeAverage());
        }
    }

}
