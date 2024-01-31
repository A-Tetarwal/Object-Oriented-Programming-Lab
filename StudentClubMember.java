public class StudentClubMember {
    String clubName;

    public StudentClubMember(String clubName) {
        this.clubName = clubName;
    }

    public String getClubName() {
        return clubName;
    }

    public static void main(String[] args) {
    Student student = new Student("Ashish", "Coding Club", "CS261");
    student.displayInfo();
    }
}

class CollegeCourse {
    String courseName;

    public CollegeCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Student extends StudentClubMember {
    String name;
    CollegeCourse courseName;

    public Student(String name, String clubName, String courseName) {
        super(clubName);
        this.name = name;
        this.courseName = new CollegeCourse(courseName);
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Club Name: " + getClubName());
        System.out.println("Course Name: " + courseName.getCourseName());
    }
}
