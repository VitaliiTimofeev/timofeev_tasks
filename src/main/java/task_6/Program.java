package task_6;

public class Program {
//    Описать класс фигуру прямоугольник:
//        * класс  имеет поля длина и ширина
//* у класса есть метод определения является ли прямоугольник квадратом



    public static void figure(){
    int width =2 ;
    int height =3;
        if (width == height) {
            System.out.println("Это кврадрат");
        }else{
            System.out.println("Это прямоугольник");
        }

    }
    public static void main(String[] args) {
        figure();
    }

}
