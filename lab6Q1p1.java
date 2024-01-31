// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

// Usage
public class lab6Q1p1{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();
    }
}
