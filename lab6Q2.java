class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void introduceYourself() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public void displayContactInfo() {
        System.out.println("Address: " + address);
    }
}

class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;

    public Teacher(String name, int age, String address, String subject, int yearsOfExperience) {
        super(name, age, address);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void teachClass() {
        System.out.println("I am a teacher of " + subject + " with " + yearsOfExperience + " years of experience.");
    }
}

class Student extends Person {
    private int studentID;
    private String major;

    public Student(String name, int age, String address, int studentID, String major) {
        super(name, age, address);
        this.studentID = studentID;
        this.major = major;
    }

    public void study() {
        System.out.println("I am a student with ID " + studentID + " majoring in " + major + ".");
    }
}

public class lab6Q2 {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "123 Main St");
        person.introduceYourself();
        person.displayContactInfo();

        System.out.println();

        Teacher teacher = new Teacher("Prof. Smith", 45, "456 Oak St", "Computer Science", 10);
        teacher.introduceYourself();
        teacher.displayContactInfo();
        teacher.teachClass();

        System.out.println();

        Student student = new Student("Alice Johnson", 20, "789 Pine St", 12345, "Biology");
        student.introduceYourself();
        student.displayContactInfo();
        student.study();
    }
}
