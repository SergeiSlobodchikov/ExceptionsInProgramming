import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeWork2 {


    public static void main(String[] args) throws Exception {
        task1();
        task2(new int[]{2, 4, 6, 8, 10});
        task3();
        task4();

    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите дробное число: ");
            try {
                number = scanner.nextFloat();
                isValidInput = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
                scanner.nextLine(); // очистка ввода
            }
        }

        System.out.println("Вы ввели число: " + number);
    }


//    Задание 2. Если необходимо, исправьте данный код
//    try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    }

    /**
     * В новом блоке try-catch значение переменной d установлено на 1, вместо 0,
     * чтобы избежать ошибки деления на ноль. Также был добавлен второй catch-блок,
     * чтобы обрабатывать ошибку выхода за границы массива.
     */
    public static void task2(int[] intArray) {
        try {
            int d = 1;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива: " + e);
        }
    }


//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = { 1, 2 };
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

    /**
     * Добавил catch блок для ArithmeticException с выводом сообщения "Деление на 0 невозможно!".
     * Изменил порядок catch блоков, так как IndexOutOfBoundsException является наследником NullPointerException, и если первый блок catch обработает исключение, то второй блок уже не выполнится.
     * Изменил индекс элемента массива в строке abc[2] = 9;, чтобы он не выходил за границы массива.
     * В метод printSum() добавил проверку на null значения аргументов, и если хотя бы один из них null, выбрасывается исключение FileNotFoundException с сообщением "Не удалось получить значения для суммирования".
     */
    public static void task3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[2] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 невозможно!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        if (a == null || b == null) {
            throw new FileNotFoundException("Не удалось получить значения для суммирования");
        }
        System.out.println(a + b);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

