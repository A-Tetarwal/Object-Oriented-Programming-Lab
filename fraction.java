public class fraction {
    private int numerator;
    private int denominator;

    public fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public fraction add(fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        fraction fraction1 = new fraction(1, 2);
        fraction fraction2 = new fraction(3, 4);

        fraction result = fraction1.add(fraction2);

        System.out.println("Result: " + result);
    }
}
