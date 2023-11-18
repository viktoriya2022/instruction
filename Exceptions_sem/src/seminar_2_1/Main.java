package seminar_2_1;

import java.io.*;
import java.util.Scanner;

public class Main {
// ======================================================================
// 1.
// ======================================================================

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] arr = new int[10];
//        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//        int index = scanner.nextInt();
//        try {
//            arr[index] = 1;
//        } catch (Exception e) {
//            System.out.println("Указан индекс за пределам массива");
//        }
//    }


//    public static void main(String[] args) {
//        try {
//            Scanner scanner = new Scanner(System.in);
//            int[] arr = new int[10];
//            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
// // Проверяем, есть ли введенное число вообще
//            int index = 0;
//            if (!scanner.hasNext()){
//               throw new IllegalArgumentException("Ошибка ввода числа.");
//            }
//            index = scanner.nextInt();
//// Проверяем, попадаем ли индексом в массив
//            if (index<0 || index >= arr.length) {
//                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределами массива");
//            }
//            arr[index] = 1;
//    } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//// Catch на случай иной ошибки (например ввели не число)
//    } catch (Exception e) {
//            System.out.println("Неизвестная ошибка");
//            e.printStackTrace();
//
//        }
//    }
// }


// ======================================================================
// 2.
// ======================================================================

//    public static void main(String[] args) {
//        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
//        System.out.println(sum);
//    }
//
//    private static int sum2d(String[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < 5; j++) {
//                int val = Integer.parseInt(arr[i][j]);
//                sum += val;
//            }
//        }
//        return sum;
//    }
//}



    public static void main(String[] args) {
//        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j"},{"1", "2", "3", "4", "j"}});
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        // Сразу заворачиваем в try catch (мало ли что вылезет)
        try {
        // Проверяем массив на наличие (массив не null)
            if (arr == null) {
                throw new NullPointerException("Масив не может быть  NULL. Невозможно вычислить сумму.");
            }
            for (String[] strings: arr) {
                if (strings.length >= 5) {
                    throw new ArrayIndexOutOfBoundsException("Внутренний массив должен иметь размер 5");
                }
                    for (int j = 0; j < 5; j++) {
        // Не останавливая приложение, проскакиваем узкие места(где невозможна конвертация).
        // При этом оставляем Val =0
                        int val = 0;
                        try {
                            val = Integer.parseInt(strings[j]);
                        } catch (NumberFormatException e){
                            e.printStackTrace();
                        }
                        sum += val;
                    }
            }
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new NullPointerException(e.getMessage());
        }catch (Exception e){
            throw new RuntimeException("Непредвиденная ошибка. " + e.getMessage());
        }
            return sum;
    }
}


// ======================================================================
// 3.
// ======================================================================


//    public static void main(String[] args) {
//        InputStream inputStream;
//        try {
//            String[] strings = {"apple", "orange"};
//            String strings1 = strings[2];
//            test();
//            int a = 1 / 0;
//            inputStream = new FileInputStream("/broken_reference");
//        } catch (Throwable e) {
//            e.printStackTrace();
///* } catch (StackOverflowError error) {
//System.out.println("Что-то сломалось");*/
//        } finally {
//            System.out.println("Я все равно выполнился");
//        }
//        System.out.println("Я жив!");
//    }
//
//    private static void test() throws IOException {
//        File file = new File("1");
//        file.createNewFile();
//        FileReader reader = new FileReader(file);
//        reader.read();
//        test();
//    }
//}
