### Класс [HomeWork1](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/main/HomeWork1.java) с методом main и пятью статическими методами: divideByZero(), accessArrayElement(), parseInt(), diffArrays() и divideArrays().

- Метод [`divideByZero()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L23) пытается выполнить деление на ноль, что приводит к генерации исключения ArithmeticException.

- Метод [`accessArrayElement()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L29) пытается обратиться к несуществующему элементу массива, что приводит к генерации исключения ArrayIndexOutOfBoundsException.

- Метод [`parseInt()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L34) пытается преобразовать строку "abc" в целочисленное значение, что невозможно, и приводит к генерации исключения NumberFormatException.

- Метод [`diffArrays()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L39) принимает два целочисленных массива и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, метод выводит сообщение "Длины массивов не равны" и возвращает null.

- Метод [`divideArrays()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L51) принимает два целочисленных массива и возвращает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, метод бросает исключение RuntimeException с сообщением "Длины массивов не равны".
---
### Класс [HomeWork2](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/main/HomeWork2.java) содержит 4 метода и main рализущий их:

- Метод [`task1()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/8a28601dddcd8b7c0c62e4d381b2d77121da3f30/HomeWork2.java#L15) запрашивает у пользователя ввод дробного числа и проверяет правильность ввода. Если ввод некорректен, пользователь получает сообщение об ошибке и ему предлагается повторить ввод.

- Метод [`task2(int[] intArray)`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/8a28601dddcd8b7c0c62e4d381b2d77121da3f30/HomeWork2.java#L44) делит 8-й элемент массива intArray на 1. Если деление на 0, то выводится сообщение "Деление на ноль", а если выход за границы массива, то выводится сообщение "Выход за границы массива".
- Метод [`task3()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/8a28601dddcd8b7c0c62e4d381b2d77121da3f30/HomeWork2.java#L82) содержит блок try-catch с несколькими catch-блоками, которые ловят различные исключения, такие как NullPointerException, ArithmeticException, IndexOutOfBoundsException и Throwable. Внутри блока try вызывается метод printSum(), который выкидывает исключение FileNotFoundException, если один из его параметров равен null. Также внутри блока try происходит обращение к элементу массива, выходящего за пределы его размера.

- Метод [`task4()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/8a28601dddcd8b7c0c62e4d381b2d77121da3f30/HomeWork2.java#L114) запрашивает у пользователя ввод строки и проверяет ее на пустоту. Если строка пустая, то выбрасывается исключение Exception с сообщением "Пустые строки вводить нельзя". Если исключение было выброшено, выводится сообщение с текстом исключения.
