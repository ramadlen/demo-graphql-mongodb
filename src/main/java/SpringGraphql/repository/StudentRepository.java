package SpringGraphql.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.repository.MongoRepository;

import SpringGraphql.model.Student;



public interface StudentRepository extends MongoRepository<Student, String> {
    

    Student getStudentById(String id);
    Student addStudent(String name);
    List<Student> getStudents(Map<String, List<String>> headers);
}
