import proxy.Student;
import proxy.StudentWS;
import proxy.StudentWebService;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        StudentWebService stub = new StudentWS().getStudentWebServicePort();
        List<Student> studentList = stub.getAllStudents();
        studentList.forEach(student -> System.out.println(student.getNom() + " ---- " + student.getPrenom()));
    }
}
