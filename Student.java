import java.util.regex.Pattern;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        validate();
    }

    // Validate age and name
    private void validate() throws AgeNotWithinRangeException, NameNotValidException {
        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException();
        }

        // Validate name using regex to check for invalid characters
        if (!Pattern.matches("[a-zA-Z ]+", name)) {
            throw new NameNotValidException();
        }
    }

    // Getters and setters (if needed)
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    // Example usage
    public class Main {
        public static void main(String[] args) {
            try {
                Student student = new Student(1, "John Doe", 22, "Computer Science");
            } catch (AgeNotWithinRangeException | NameNotValidException e) {
                System.out.println(e.getMessage());
            }

            try {
                Student student = new Student(2, "John123", 20, "Mathematics");
            } catch (AgeNotWithinRangeException | NameNotValidException e) {
                System.out.println(e.getMessage());
            }
       }
    }
}



