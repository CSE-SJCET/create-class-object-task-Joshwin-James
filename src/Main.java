class Student {
    String name;
    int rollNo;
    char grade;

    public void displayDetail() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Joshwin";
        student.rollNo = 43;
        student.grade = 'C';

        student.displayDetail();
    }
}
