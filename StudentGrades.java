import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> gradeMap;

    public StudentGrades() {
        gradeMap = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        gradeMap.put(name, grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (gradeMap.containsKey(name)) {
            gradeMap.remove(name);
            System.out.println("Student " + name + " has been removed.");
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }
    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (gradeMap.containsKey(name)) {
            int grade = gradeMap.get(name);
            System.out.println("Grade for " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " does not exist.");
        }
    }

    public static void main(String[] args) {
        StudentGrades studentGrades = new StudentGrades();

        // Adding students
        studentGrades.addStudent("Alice", 90);
        studentGrades.addStudent("Bob", 85);

        // Displaying grades
        studentGrades.displayGrade("Alice");
        studentGrades.displayGrade("Bob");

        // Removing a student
        studentGrades.removeStudent("Bob");

        // Trying to display a removed student's grade
        studentGrades.displayGrade("Bob");
   }


}
