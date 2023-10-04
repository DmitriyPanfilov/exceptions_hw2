package lesson2.homework;
//Исходный код:
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


public class task2 {
    public static void main(String[] args) {
        try {
             int d = 0;
             int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // объявлен массив intArray
             double catchedRes1 = intArray[8] / d;
             System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException|IndexOutOfBoundsException e) {
             System.out.println("Catching exception: " + e);
        }
    }
}

