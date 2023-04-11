### Класс [HomeWork1](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/main/HomeWork1.java) с методом main и пятью статическими методами: divideByZero(), accessArrayElement(), parseInt(), diffArrays() и divideArrays().

- Метод [`divideByZero()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L23) пытается выполнить деление на ноль, что приводит к генерации исключения ArithmeticException.

- Метод [`accessArrayElement()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L29) пытается обратиться к несуществующему элементу массива, что приводит к генерации исключения ArrayIndexOutOfBoundsException.

- Метод [`parseInt()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L34) пытается преобразовать строку "abc" в целочисленное значение, что невозможно, и приводит к генерации исключения NumberFormatException.

- Метод [`diffArrays()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L39) принимает два целочисленных массива и возвращает новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, метод выводит сообщение "Длины массивов не равны" и возвращает null.

- Метод [`divideArrays()`](https://github.com/SergeiSlobodchikov/ExceptionsInProgramming/blob/c65a1729aba78c83464cd9a753f0625caf8718ee/HomeWork1.java#L51) принимает два целочисленных массива и возвращает новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, метод бросает исключение RuntimeException с сообщением "Длины массивов не равны".
