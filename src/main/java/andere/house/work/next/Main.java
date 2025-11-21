import java.util.Arrays;
import java.util.List;

record Purchase(String name, int price) {}

public class Main {
    public static void main(String[] args) {
        List<Purchase> purchases = Arrays.asList(
                new Purchase("Хлеб", 50),
                new Purchase("Молоко", 80),
                new Purchase("Телефон", 15000),
                new Purchase("Книга", 500),
                new Purchase("Ноутбук", 50000),
                new Purchase("Кофе", 300),
                new Purchase("Наушники", 2500),
                new Purchase("Ручка", 30),
                new Purchase("Планшет", 12000),
                new Purchase("Блокнот", 150)
        );

        System.out.println("Покупки дешевле 1000 р:");
        purchases.stream()
                .filter(p -> p.price() < 1000)
                .limit(5)
                .forEach(p -> System.out.println(p.name() +" "+ p.price()));

        System.out.println("Покупки дороже 1000 р:");
        purchases.stream()
                .filter(p -> p.price() > 1000)
                .limit(4)
                .forEach(p -> System.out.println(p.name()+" "+ p.price()));
    }
}