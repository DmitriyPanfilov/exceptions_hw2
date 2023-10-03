package lesson2.homework;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (work){
            System.out.println("Введите дробное число: ");
            try {
                float Number = Float.parseFloat(reader.readLine());
                System.out.printf("Вы ввели число %f\n", Number);
                work = false;
            } catch (IOException | NumberFormatException e){
                System.out.println("Введено неверное значение, попробуйте снова: ");
            }
        }
    }
}
