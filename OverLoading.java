import java.util.Scanner;

class Overriding {
    public void m1() {
        System.out.println("This is assignment from lab 6");
    }
}

public class OverLoading extends Overriding {
    @Override
    public void m1() {
        System.out.println("This is an overridden method");
    }

    public void m1(int a) {
        System.out.println(a * a + ", Overloaded method");
    }

    public static void main(String[] args) {
        OverLoading E1 = new OverLoading();

        E1.m1();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int a = sc.nextInt();
            E1.m1(a);
        }
    }
}
