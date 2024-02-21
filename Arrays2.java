import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    static void print_array(int[] arr) { // static use krne pr class ka object nahin banana pdta
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void arrInput() {
        int[] arr = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("[");
        print_array(arr);
        System.out.println("]");
    }

    void arrInput2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();
        int[] arr = new int[n];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("[");
        print_array(arr);
        System.out.println("]");
    }

    static void countOccurences(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number you wnna check the number of occurences of");
        int n = sc.nextInt();

        int occurences = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                occurences++;
            }
        }

        System.out.println(n + " occured " + occurences + " times");
    }

    static void findLastOccurence(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number you wnna check the last occurences of");
        int n = sc.nextInt();

        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                lastIndex = i;
            }
        }
        System.out.println(n + " lastly occured at index " + lastIndex);
    }

    static void totalGreaterElements(int[] arr, int element) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x to check how many greater elements than x are present in array");
        element = sc.nextInt();

        int countGreaterElements = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element < arr[i]) {
                countGreaterElements++;
            }
        }
        System.out.println("no. of elements greater than " + element + " are " + countGreaterElements);
    }

    static void checkSorted(int[] arr) { // ye increasing order ke liye hai, hum decreasing ke liye bhi bna skte hain
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("Array we're checking is sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    static void checkSorted2() { // ye increasing order ke liye hai, hum decreasing ke liye bhi bna skte hain

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1));
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("You entered sorted array");
        } else {
            System.out.print("You entered unsorted array ");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // hum print array naam ka function bna skte hain, array input lene ka function
        // bna skte, aur scanner ko saare methods se pehle hi likh skte hai, to easy the
        // process
    }

    // other way
    static void checkSorted3(int[] arr) { // ye increasing order ke liye hai, hum decreasing ke liye bhi bna skte hain
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        if (!isSorted) {
            System.out.println("Array we're checking is not sorted");
        }
    }

    public static void main(String[] args) {
        Arrays2 A2 = new Arrays2();
        // A2.arrInput();
        // A2.arrInput2();
        // arrInput();

        int[] array1 = { 1, 4, 5, 6, 7, 8 };
        // int[] array2= array1.clone();//copying array using clone
        int[] array2 = Arrays.copyOf(array1, array1.length);// copying array using copyOf method,
                                                            // importing java.util.Arrays is necessary
                                                            // Array.copyOfRange(array, startIndex, endIndex)

        for (int i = 0; i < array2.length; i++) {
            array2[i] = 0;
        }
        print_array(array2);

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 9, 8, 6, 5, 5, 7, 5, 3, 3, 6, 5, 2, 1 };
        countOccurences(arr1);
        findLastOccurence(arr1);
        totalGreaterElements(arr1, 5);
        checkSorted(arr1);
        checkSorted2();
        checkSorted3(arr1);
    }
}
