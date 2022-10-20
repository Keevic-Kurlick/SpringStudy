package spring.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;

@Service //same as Component. spring bean
public class StudentService {

    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mar",
                        30,
                        LocalDate.of(2000, 5, 5),
                        "Mas@mail.ru"

                )
        );
    }
}
