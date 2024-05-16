import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumLimit(10, 9));
        numberPositiveOrNegative(-21);
        System.out.println(isNumberNegative(6));
        lineSeveralTimes("lalalal", 10);
        System.out.println(isYearLeap(800));
        arrElementsChanger();
        arrElementsPlaceholder();
        arrElementsMultiplication();
        tableDiagonalToUnit(7);
        arrIntLenInitialvalue(6,6);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = -21;
        if (a + b >= 0) {
            System.out.println("the sum is positive");
        } else {
            System.out.println("the sum is negative");
        }
    }

    static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 123;
        int b = 456;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static Boolean sumLimit(int num_1, int num_2) {
            return num_1 + num_2 >= 10 && num_1 + num_2 <= 20;
    }

    static void numberPositiveOrNegative(int num) {
        if (num >= 0) {
            System.out.println(num + " - is positive");
        } else {
            System.out.println(num + " - is negative");
        }
    }

    static Boolean isNumberNegative(int num) {
        return num < 0;
    }

    static void lineSeveralTimes(String line, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(line);
        }
    }

    static Boolean isYearLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0);
    }

    static void arrElementsChanger() {
        int[] arr = new int[]{1, 0, 1, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void arrElementsPlaceholder() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void arrElementsMultiplication() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void tableDiagonalToUnit(int len) {
        int[][] table = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0, len1 = len; j < len; j++, len1--){
                if (i == j) {
                    table[i][j] = 1;
                } else if (i == len1 - 1) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void arrIntLenInitialvalue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}

