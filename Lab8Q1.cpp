#include <iostream>

class Fraction {
private:
    int numerator;
    int denominator;

public:
    Fraction(int num, int denom) : numerator(num), denominator(denom) {

        if (denominator == 0) {
            std::cerr << "Error: Denominator cannot be zero." << std::endl;
            exit(1);
        }
    }


    Fraction operator+(const Fraction& other) const {
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int newDenominator = denominator * other.denominator;
        return Fraction(newNumerator, newDenominator);
    }


    void print() const {
        std::cout << numerator << "/" << denominator;
    }
};

int main() {
    Fraction fraction1(1, 2);
    Fraction fraction2(1, 4);

    Fraction result = fraction1 + fraction2;

    std::cout << "Result: ";
    result.print();
    std::cout << std::endl;

    return 0;
}
