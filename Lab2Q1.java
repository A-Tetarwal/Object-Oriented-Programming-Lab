import java.util.*;

class Area {
    float x1, y1;
    float x2, y2;

    public float length(float x1, float x2) {
        this.x1 = x1;
        this.x2 = x2;
        return x2 - x1;
    }

    public float width(float y1, float y2) {
        this.y1 = y1;
        this.y2 = y2;
        return y2 - y1;
    }

    public Area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1, x2(>x1), y1 and y2(>y1)");
        System.out.println("Area of " + length(sc.nextInt(), sc.nextInt()) * width(sc.nextInt(), sc.nextInt()));
    }
}

public class Lab2Q1 {
    public static void main(String[] args) {
        Area R1 = new Area();
    }
}
