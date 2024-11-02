package SpringGraphql.Service;

import java.util.List;
import java.util.Map;

import SpringGraphql.model.Student;

public interface StudentService {
    Student getStudentById(String id);
    Student addStudent(String name);
    List<Student> getStudents(Map<String, List<String>> headers);
}
