package task_1;

public class Program {
   /* Написать программу, которая:
* находит среди массива максимальное число
* находит среди массива минимальное число
* находит среднее значение всех чисел
    Все числа вывести на консоль.*/
   public static void main(String[] args) {
       int [] array = new int [10];
       int max = array [0];
       int min = array [0];
       double middle = 0;
       double sum = 0;

       for (int i = 0; i < array.length; i++){
           array [i] = i;
           System.out.print (i + " ");

           if (max < array[i])
               max = array[i];
           if (min > array[i])
               min = array[i];
           sum += array [i];
           middle = sum/array.length;
       }
       System.out.println("\nmax = " + max);
       System.out.println("min = " + min);
       System.out.println("middle = " + middle);
   }

}
