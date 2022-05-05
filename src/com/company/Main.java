package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Создайте класс Triangle, у класса должны быть поля a, b, c.
                В классе создайте метод "area" который при вызове выводит на консоль площадь треугольника*/

        Triangle jaim = new Triangle();
        Scanner scanner = new Scanner(System.in);
        jaim.a = scanner.nextInt();
        jaim.b = scanner.nextInt();
        jaim.c = scanner.nextInt();
        jaim.area(jaim.a, jaim.b, jaim.c);
    }

}
