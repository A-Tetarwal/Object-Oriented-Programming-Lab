import java.util.Scanner;

public class Lab1Q2 {
    class Student {
        int studentID, marks;
        String studentName;

        public void setDetails(int studentID, int marks, String studentName) {
            this.studentID = studentID;
            this.studentName = studentName;
            this.marks = marks;
        }

        public void grades() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter marks");
            marks = sc.nextInt();
            if (marks >= 91) {
                System.out.println("Grade is A");
            } if(marks>=75 && marks<=90) {
                System.out.println("Grade is B");
            }
             if(marks>=60 && marks<=74) {
                System.out.println("Grade is C");
            }
             if(marks>=45 && marks<=35) {
                System.out.println("Grade is D");
            }
             if(marks>=0 && marks<=33) {
                System.out.println("Grade is F");
            }
        }

        public void displayDetails() {
            System.out.println("Marks: " + marks);
            System.out.println("Name: " + studentName);
            System.out.println("ID: " + studentID);
        }
    }

    public static void main(String[] args) {
        Lab1Q2 lab = new Lab1Q2();
        Lab1Q2.Student student = lab.new Student();

        student.setDetails(202251024, 0, "tetu"); // You can set the initial values here
        student.grades(); // Get marks from user input
        student.displayDetails(); // Display the details
    }
}
