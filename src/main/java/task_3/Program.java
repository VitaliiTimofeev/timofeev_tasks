package task_3;

import java.util.Scanner;




public class Program {
    /*Написать программу, которая:
* просить ввести слово, начинающееся на букву "А" в консоль
* проверяет слово на наличие букву "А" в начале
* если слово начинается не на "А" - просит ввести повторно, пока не будет введено требуемое слово
* если слово начинается на "А" - благодарит и завершает исполение*/


    public static void main(String[] args) {
        String str = "";
        do {
            System.out.println("Введите слово начинающиеся на букву А");
            str = new Scanner(System.in).nextLine();
        } while (!str.startsWith("А"));
        System.out.println("Спасибо!");
    }
}