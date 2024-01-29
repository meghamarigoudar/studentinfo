import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date dateOfBirth;

    public Student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = parseDate(dateOfBirth);
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge() {
        if (dateOfBirth != null) {
            Date currentDate = new Date();
            int age = calculateAge(currentDate, dateOfBirth);
            System.out.println("Student Age: " + age + " years");
        } else {
            System.out.println("Unable to calculate age due to invalid date of birth.");
        }
    }

    private Date parseDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }

    private int calculateAge(Date currentDate, Date birthDate) {
        int age = currentDate.getYear() - birthDate.getYear();
        if (currentDate.getMonth() < birthDate.getMonth() ||
            (currentDate.getMonth() == birthDate.getMonth() && currentDate.getDate() < birthDate.getDate())) {
            age--;
        }
        return age;
    }

    public static void main(String[] args) {
        // Example Usage:
        Student student1 = new Student("John Doe", "15-05-1995");
        student1.displayName();
        student1.displayAge();
    }
}
