class Lab1Q1b{

    // Q1b
    public static boolean isPowerOf4Recursive(int n) {
        if (n==1) {
            return true;
        }

        if (n<=0||n%4!=0) {
            return false;
        }

        return isPowerOf4Recursive(n / 4);
    }

    public static void main(String[] args) {
        int n = 32; // Change this to the number you want to check
        boolean result = isPowerOf4Recursive(n);

        if (result) {
            System.out.println(n + " is a power of four.");
        } else {
            System.out.println(n + " is not a power of four.");
        }
    }
}
