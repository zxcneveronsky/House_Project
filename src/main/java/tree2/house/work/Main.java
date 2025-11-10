package tree2.house.work;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("«Список покупок»");
        System.out.print("Сколько хотите добавить товаров? (Количество) : ");
        int a = scanner.nextInt();
        ArrayList<String> listBuy = new ArrayList<String>(a);
        for (int i=0;i<=a;i++){
            listBuy.add(scanner.nextLine());
            if(i<a) {
                System.out.println("Пожалуйста введите товар, который хотите добавить: ");
            }
        }
        int q = 0;
        if (a!=0) {
            System.out.println("Хотите ли удалить какой-то товар? (1-да , 2-нет) : ");
            int b = scanner.nextInt();
            q=b;
        } else{
            q = 0;
        }

        if (q==1){
            System.out.println("Сколько? (Количество) : ");
            int c = scanner.nextInt();
            for (int i=0;i<=c;i++){
                listBuy.remove(scanner.nextLine());
                if (i<c) {
                    System.out.println("Какой товар? (Название) : ");
                }
            }
        } else{
            System.out.println("OK");
        }
        System.out.println("Вывожу ваш список покупок!");
        System.out.println(listBuy);
    }

}
