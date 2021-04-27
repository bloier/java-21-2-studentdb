package de.neuefische.studendb.model;

import com.sun.jdi.connect.Connector;
import de.neuefische.studendb.db.StudentDb;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;


public class StudentInterfaceTest {
    @ParameterizedTest
    @MethodSource("provideTestResultOfGradeMethod")
    public void testResultOfGradeMethod(Student[] givenStudents,
                                        int[] expectedGrades){
        StudentDb studentDb = new StudentDb(givenStudents);
        int[] actualGrades = studentDb.resultOfGradeMethod();

        assertArrayEquals(expectedGrades, actualGrades);

    }

    private static Arguments[] provideTestResultOfGradeMethod(){
        return new Arguments[]{
                Arguments.of(
                        new Student[] {
                                new HistoryStudent("Harry", "34"),
                                new MathStudent("Hermione", "71")
                        },
                        new int[]{ 2, 1}
                )
        };
    }
}
