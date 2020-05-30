package task_7;

import java.util.Scanner;

public class Program {
   /* С клавиатуры в консоль задается число n. Вывести в консоль все числа от n до 1 в строку через пробел при помощи рекурсии.*/

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();
        recurs(num);
    }

    public static int recurs(int num) {
        if (num < 1) {
            return 1;
        }
        System.out.print(num + " ");
        return recurs(num - 1);
    }
}

