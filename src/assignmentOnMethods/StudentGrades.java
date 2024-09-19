package assignmentOnMethods;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Map<String, Integer>> studentGrades;

    public StudentGrades() {
        studentGrades = new HashMap<>();
        // Add three initial students (replace placeholder grades with actual values)
        studentGrades.put("Naveen1", new HashMap<>() {{
            put("Assignment 1", 80);
            put("Assignment 2", 90);
        }});
        studentGrades.put("Naveen2", new HashMap<>() {{
            put("Assignment 1", 75);
            put("Assignment 2", 85);
        }});
        studentGrades.put("Naveen3", new HashMap<>() {{
            put("Assignment 1", 95);
            put("Assignment 2", 88);
        }});
    }

    public void addNewStudentGrade(String studentName, String assignmentName, int grade) {
        if (!studentGrades.containsKey(studentName)) {
            studentGrades.put(studentName, new HashMap<>());
        }
        studentGrades.get(studentName).put(assignmentName, grade);
    }

    public void removeGrade(String studentName, String assignmentName) {
        if (studentGrades.containsKey(studentName) && studentGrades.get(studentName).containsKey(assignmentName)) {
            studentGrades.get(studentName).remove(assignmentName);
        }
    }

    public void viewGrades() {
        for (String studentName : studentGrades.keySet()) {
            System.out.println("Student: " + studentName);
            Map<String, Integer> assignments = studentGrades.get(studentName);
            for (String assignmentName : assignments.keySet()) {
                System.out.println("\tAssignment: " + assignmentName + ", Grade: " + assignments.get(assignmentName));
            }
            System.out.println();
        }
    }
}