import org.junit.jupiter.api.Test;

import com.example.builder.Student;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BuilderTests {

    private static final String FIRST_NAME = "John";
    private static final String LAST_NAME = "Doe";
    private static final LocalDate DOB = LocalDate.of(2000, 1, 1);
    private static final List<Integer> GRADES = List.of(85, 90, 78);
    private static final List<String> MICE = List.of("Logitech", "Razer");
    private static final int HEIGHT = 180;

    @Test
    void testStudentBuilder() {
        Student student = Student.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .dob(DOB)
                .grades(GRADES)
                .mice(MICE)
                .height(HEIGHT)
                .build();

        assertAll(
                () -> assertEquals(FIRST_NAME, student.getFirstName()),
                () -> assertEquals(LAST_NAME, student.getLastName()),
                () -> assertEquals(DOB, student.getDob()),
                () -> assertEquals(GRADES, student.getGrades()),
                () -> assertEquals(MICE, student.getMice()),
                () -> assertEquals(HEIGHT, student.getHeight())
        );
    }

}
