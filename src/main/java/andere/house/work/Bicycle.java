package andere.house.work;

public class Bicycle {
    int wheels;
    String name;
    void bicycle(int wheels, String name){
        this.name=name;
        this.wheels=wheels;
    }
    static class Seat{
        void Signal(){
            System.out.println("****");
        }


    }
}
