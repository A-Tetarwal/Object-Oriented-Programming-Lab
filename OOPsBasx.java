class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }

    public void showColType(){
        // this.color=color;
        System.out.println(this.type+" pen and "+this.color+" colour");
    }
}

class Student{
    String name;
    int id;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    Student(){//this is non-parameterized constructor
        System.out.println("Constructor called");
    }

    Student(String name, int id){//this is parameterized constructor
        this.name=name;
        this.id=id;
    }

    Student(Student student2){//this is a copy constructor
        this.name=student2.name;
        this.id=student2.id;
    }

}

public class OOPsBasx {
   public static void main(String[] args) {
    Pen pen1= new Pen();
    pen1.color="blue";
    pen1.type="gel";

    Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="gel";


    pen1.write();
    // System.out.println(pen1.color);
    pen1.showColType();//ye method call krke kitne bhi attributes print krwa skte h
    pen2.showColType();


    Student student1=new Student("Woof", 202251024);
    Student student2=new Student(student1);
    student1.printinfo();
    student2.printinfo();
   } 
}
