package entite.ws;

import entite.Student;
import enums.Genre;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "studentWS")
public class StudentWebService {

    @WebMethod(operationName = "getAllStudents")
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "John", "Doe", Genre.HOMME),
                new Student(2, "Jane", "Doe", Genre.FEMME),
                new Student(3, "Bob", "Smith", Genre.HOMME)
        );
    }
}
