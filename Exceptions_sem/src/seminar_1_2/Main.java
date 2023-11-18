/* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.

*/

package seminar_1_2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Объявляем объект рандом
        Random rnd = new Random();
        //Объявляем двумерный массив с заданной размерностью
        int arr[][] = new int[3][3];
        //заполняем массив рандомно числами до 2 (0 и 1)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(2);
            }
        }
        //Вызываем метод вывода массива на консоль
        printArray(arr);
        //Вызываем метод расчета суммы
        System.out.println(calcArray(arr));
    }

    //Метод вывода массива на консоль
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        }
    }

    private static int calcArray(int[][] arr) {
        int sum = 0;
        //для каждой строки до её конца
        for (int i = 0; i < arr.length; i++) {
            //если длина строки не равна длине массива (проверка на "квадратность"), выбрасываем исключение
            if (arr[i].length != arr.length) {
                throw new RuntimeException("Массив не квадратный.");
            }
            //если значение кажного элемента не 0 или 1, выбрасываем исключение
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("В массиве есть элементы, отличные от 0 и 1.");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
