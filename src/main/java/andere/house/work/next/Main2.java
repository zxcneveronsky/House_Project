package andere.house.work.next;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
record myList (String name, int price, int counter) {}

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<myList> purshace = new ArrayList<>();
        for(int i=0 ; i<10 ;i++){
            purshace.add(new myList(scan.next(),scan.nextInt(),scan.nextInt()));

        }
        myList lowPrice = purshace.stream()
                .min(Comparator.comparing(myList::price)).get();
        myList lowCounter = purshace.stream()
                .min(Comparator.comparing(myList::counter)).get();
        System.out.println("название + лоу цена " + lowPrice.name()+" "+lowPrice.price());
        System.out.println("название + лоу кол-во " + lowCounter.name()+" "+lowCounter.counter());
    }
}

//Хлеб 50 2
//Молоко 80 1
//Яблоки 200 5
//Сыр 350 1
//Колбаса 450 1
//Вода 60 6
//Шоколад 120 3
//Кофе 500 1
//Чай 300 2
//Сахар 100 1
