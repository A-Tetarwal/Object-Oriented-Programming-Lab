import java.util.Scanner;

class Student {
    int roll, no_of_subs;
    String name;
    int marks;
    int[] credits; 
    int totalCredit;
    int total; 

    public void Credits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.");
        roll=sc.nextInt();

        System.out.println("Enter no. of subjects");
        no_of_subs = sc.nextInt();

        credits = new int[no_of_subs]; 

        for (int i = 1; i <= no_of_subs; i++) {


            System.out.println("Enter Marks of subject " + i + " (out of 100)");
            marks = sc.nextInt();
            int gradepts = marks / 10;
            System.out.println("GP for subject " + i + " is " + gradepts);

            System.out.println("Enter Credits for subject " + i);
            credits[i - 1] = sc.nextInt(); 
            totalCredit += credits[i - 1]; 

            int subjectTotal = credits[i - 1] * gradepts;
            System.out.println("credit*GP for sub " + i + " is " + subjectTotal);
            total += subjectTotal;
        }

        if (totalCredit == 0) {
            System.out.println("CPI = 0.0"); 
        } else {
            System.out.println("CPI = " + (double) total / totalCredit); 
        }
    }
}

public class Lab2Q2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Credits();
    }
}
