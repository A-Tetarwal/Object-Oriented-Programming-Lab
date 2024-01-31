class Student{
    String name;
    int id;

    public void printinfo(){
        System.out.println(name);
    }

    public void printinfo(int id){
        System.out.println(id);
    }

    public void printinfo(String name, int id){
        System.out.println(name+id);
    }
}

public class OOPsPolymorphism {
   public static void main(String[] args) {

    Student student1=new Student();
    student1.name="Woof";

    student1.printinfo(student1.id);
   } 
}

