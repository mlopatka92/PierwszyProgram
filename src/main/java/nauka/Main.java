package nauka;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int EXCLUSIVE_BOUNDRY_VALUE = 5;

    public static void main(String[] args) {
        int generatedNumber = generateNumber(EXCLUSIVE_BOUNDRY_VALUE);
        displayIntroductionText();
        int numberFromConsole = readSingleNumberFromConsole();
        compareResult(++generatedNumber, numberFromConsole);
    }

    private static int generateNumber(int bound) {
        //tutaj znajduje się logika metody losującej liczbę losową z danego zakresu (podpowiedź: zajmuje się tym klasa Random)
        return 0;
    }

    private static void displayIntroductionText() {
        System.out.println("Wylosowale liczbe z przedzialu od 1 do " + (EXCLUSIVE_BOUNDRY_VALUE - 1) + ".");
        System.out.print("Zgadnij jaka to liczba: ");
    }

    private static int readSingleNumberFromConsole() {
        Scanner consoleReader = new Scanner(System.in);
        String passedNumber = consoleReader.nextLine();
        return Integer.valueOf(passedNumber);
    }

    private static void compareResult(int generatedNumber, int numberFromConsole) {
        /*Tutaj powinna znajdować się metoda porównująca obie liczby i wyświetlająca odpowiedni komunikat.
        Przy w przypadku równości obu liczb powinno zostać wyświetlone: "Gratulacje, udało się!"
        W innym przypadku: "Pudło!".

        */
    }

}
