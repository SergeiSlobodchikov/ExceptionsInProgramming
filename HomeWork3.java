import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Консольная Программа ввода данных в файл .txt\n" +
                           "Запись производим через пробел\n" +
                           "В формате: Фамилия Имя Отчество дата_рождения номер_телефона пол\n" +
                           "Пример: Казачкова Татьяна Валерьевна 14.07.1970 8916790242 f\n" +
                           "Введите данные: ");
        String input = scanner.nextLine();

        try {
            parseUserData(input);
            System.out.println("Данные корректны");
        } catch (InvalidDataLengthException e) {
            System.out.println("Неверное количество данных: " + e.getMessage());
        } catch (InvalidDataFormatException e) {
            System.out.println("Неверный формат данных: " + e.getMessage());
        }
    }

    public static void parseUserData(String input) throws InvalidDataLengthException, InvalidDataFormatException {
        String[] data = splitData(input);
        checkDataLength(data);
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String dateOfBirth = data[3];
        String phoneNumber = data[4];
        String gender = data[5];
        checkDateOfBirthFormat(dateOfBirth);
        checkPhoneNumberFormat(phoneNumber);
        checkGenderFormat(gender);
        writeToFile(lastName, firstName, middleName, dateOfBirth, phoneNumber, gender);
    }

    private static String[] splitData(String input) {
        return input.split(" ");
    }

    private static void checkDataLength(String[] data) throws InvalidDataLengthException {
        if (data.length != 6) {
            throw new InvalidDataLengthException("Недопустимая длина данных: " + data.length);
        }
    }

    private static void checkDateOfBirthFormat(String dateOfBirth) throws InvalidDataFormatException {
        if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDataFormatException("Неверный формат даты рождения: " + dateOfBirth);
        }
    }

    private static void checkPhoneNumberFormat(String phoneNumber) throws InvalidDataFormatException {
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("Неверный формат номера телефона: " + phoneNumber);
        }
    }

    private static void checkGenderFormat(String gender) throws InvalidDataFormatException {
        if (!gender.equals("f") && !gender.equals("m") && !gender.equals("м") && !gender.equals("ж")) {
            throw new InvalidDataFormatException("Недопустимый формат пола: " + gender);
        }
    }

    private static void writeToFile(String lastName, String firstName, String middleName, String dateOfBirth, String phoneNumber, String gender) {
        String filename = lastName + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("<" + lastName + ">" +  "<" + firstName + ">" +  "<" + middleName + ">" +  "<" + dateOfBirth + ">" +  "<" + phoneNumber + ">" +  "<" + gender + ">");
            writer.newLine();
            System.out.println("Данные успешно записаны в файл " + filename);
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл:");
            e.printStackTrace();
        }
    }

}