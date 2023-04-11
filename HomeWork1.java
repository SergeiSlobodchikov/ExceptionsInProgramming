import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {
        divideByZero();
        // ArithmeticException
        accessArrayElement();
        // ArrayIndexOutOfBoundsException
        parseInt();
        // NumberFormatException

        int[] arr1 = {1, 2, 5};
        int[] arr2 = {4, 5, 10};
        System.out.println(Arrays.toString(diffArrays(arr1,arr2)));
        try {
            int[] result = divideArrays(arr1, arr2);
            System.out.println(Arrays.toString(result)); // Output: [0, 0, 0]
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // Output: Lengths of arrays are not equal
        }

    }
    public static int divideByZero() {
        int a = 5;
        int b = 0;
        return a/b;
    }

    public static int accessArrayElement() {
        int[] arr = {1, 2, 3};
        return arr[3];
    }

    public static int parseInt() {
        String s = "abc";
        return Integer.parseInt(s);
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны");
            return null; // или можно бросить исключение
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }

}
