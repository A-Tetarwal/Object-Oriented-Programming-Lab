class Lab1Q1a{

    // Q1a
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        int n = 32; // Change this to the number you want to check
        boolean result = isPowerOfFour(n);

        if (result) {
            System.out.println(n + " is a power of four.");
        } else {
            System.out.println(n + " is not a power of four.");
        }
    }
}
