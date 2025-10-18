package tho.house.work;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static tho.house.work.Constants.PI; // это тож подсказал идеа

import static tho.house.work.MathUtils.add; // это подсказал идеа сделать -_-

public class MainTwo {
    public static void main(String[] args){


        System.out.println("Результат 1-го задания: " + add(3,10));
        System.out.println("");


        Counter a = new Counter();
        Counter b = new Counter();
        Counter v = new Counter();
        Counter q = new Counter();
        Counter w = new Counter();
        Counter r = new Counter();
        System.out.println("Результат 2-го задания: "+Counter.count);
        System.out.println("");


        System.out.print("Введите Радиус для расчета площади круга данного радиуса: ");
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        System.out.println("Результат 3-го задания: " + R * PI);
    }
}
