package tree3.house.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lL = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("«Очередь задач»");;
        while (true){
            System.out.println("Что хотим сделать?");
            System.out.println("1-Посмотреть Очередь задач");
            System.out.println("2-Добавить задачу в очередь");
            System.out.println("3-Посмотреть текущую (Первую в очереди) и следующую задачу без удаления");
            System.out.println("4-Удалить задачу");
            System.out.println("5-Exit");

            int a = scanner.nextInt();
            scanner.nextLine(); // помог дипсик понять, что после int a = scanner.nextInt(); появляется /n в буфере
            // int i = -1;
            if (a==1){
                if (lL.isEmpty()){
                    System.out.println("Очередь пуста...");
                } else{
                    System.out.println(lL);
                }
            } else if (a==2) {

                System.out.println("Введите задачу: ");
                String b = scanner.nextLine();
                lL.add(b);
                // i+=1;
            } else if (a==3) {
                if (lL.isEmpty()) {
                    System.out.println("Очередь пуста...");
                } else {
                    System.out.println("Текущая: " + lL.get(0));
                    System.out.println("Следующая: " + lL.get(1));
                }
            } else if (a==4) {
                if (lL.isEmpty()) {
                    System.out.println("Очередь пуста...");
                } else {
                    System.out.println("Какую задачу хотите удалить?");
                    String c = scanner.nextLine();
                    lL.remove(c);
                }
            } else if (a==5) {
                break;
            } else {
                System.out.println("ERROR : Введите корректное значение!");
            }
        }
    }
}
