package data;

import java.util.*;
import model.Student;

public class Dao {
    private List<Student> students;

    public Dao() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student Added Successfully!");
    }

    // View Students
    public void viewStudent() {
        if (students.isEmpty()) {
            System.out.println("No students added yet!");
        } else {
            System.out.println("List of Students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Remove Student by ID
    public void removeStudent(int id) {
        Iterator<Student> it = students.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                System.out.println("Student Removed Successfully!");
                found = true;
                break; // stop after removing
            }
        }
        if (!found) {
            System.out.println("Student Does Not Exist!");
        }
    }
}
