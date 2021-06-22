package ru.geekbrains.lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число");
         int range = 14;
         int number = (int) (Math.random() * range);
         while (true) {
             System.out.println("угадай число 0 до "  + range);
             int input_number = scanner.nextInt();
             if (input_number == number) {
                System.out.println("Ура");
                break;
            }else if (input_number > number){
                 System.out.println("Меньше");
            } else {
                 System.out.println("Больше");
             }
         }
         scanner.close();
    }
}
