package lesson2.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class task4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        try {
            String result = reader.readLine();
            if (result.equals("")) throw new RuntimeException("Пустую строку вводить нельзя!");
            System.out.println(result);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
