package ru.kamuzta.socketchat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        while (true) {
            String inputString;
            try {
                inputString = br.readLine();
                return inputString;
            } catch (IOException ioe) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            }
        }
    }

    public static int readInt() {
        while (true) {
            String inputString;
            try {
                inputString = readString();
                return Integer.parseInt(inputString);
            } catch (NumberFormatException nfe) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
            }
        }
    }
}
