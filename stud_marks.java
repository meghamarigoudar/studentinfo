public class stud_marks {
    private String name;
    private String dateOfBirth;

    public Student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
    }

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", "15-05-1995");
        student1.displayName();
        student1.displayAge();
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayCoursesAndMarks();
    }
}

class StudentCourses {
    public void displayCoursesAndMarks() {
        System.out.println("\nCourses and Marks for Semester 1:");
        displaySemesterCourses(1);
        System.out.println("\nCourses and Marks for Semester 2:");
        displaySemesterCourses(2);
    }

    private void displaySemesterCourses(int semester) {
        switch (semester) {
            case 1:
                System.out.println("Course 1: Mathematics - 85");
                System.out.println("Course 2: English - 90");
                break;
            case 2:
                System.out.println("Course 1: Physics - 88");
                System.out.println("Course 2: History - 78");
                break;
        }
    }
}
