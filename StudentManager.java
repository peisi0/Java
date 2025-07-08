import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addStudent(Student s) throws DuplicateIdException {
        System.out.println("Enter Student ID: ");
        students.add(input.nextInt(), s);
    }

    public void removeStudent(String id) {}

    public Student findStudent(String id) {}

    public void sortByTotalScore() {}

    public Map<String, Double> calculateSubjectAverages() {}

    public static void main(String[] args) {

    }
}
