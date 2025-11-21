package andere.house.work;

public class Person {
    String name;
    int age;
    class Teathers {
        int earsWork;
        void song(){
            System.out.println("Крики, Ругань");
        }
//        void Teachers(int earsWork){ пытался сделать конструктор для иннер класса но что то не пошло -_-
//            this.earsWork=earsWork;
//        }

    }
    void person(String name, int age){
        this.age=age;
        this.name=name;
    }
}
