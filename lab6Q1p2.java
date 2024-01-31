// Interface 1
interface Swimmer {
    void swim();
}

// Interface 2
interface Flyer {
    void fly();
}

// Concrete class implementing multiple interfaces
class Bird implements Swimmer, Flyer {
    @Override
    public void swim() {
        System.out.println("Bird is swimming");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Usage
public class lab6Q1p2{
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.swim();
        myBird.fly();
    }
}
