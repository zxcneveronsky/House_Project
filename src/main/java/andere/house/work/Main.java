package andere.house.work;

public class Main {
    public static void main(String[] args) {


        Person newPerson = new Person();
        newPerson.name="Elisabet";
        newPerson.age=22;
        Person.Teathers newTeathers = newPerson.new Teathers();
        newTeathers.song();

        Bicycle newBicycle = new Bicycle();
        newBicycle.wheels=2;
        newBicycle.name="Stinger";
        Bicycle.Seat newSeat = new Bicycle.Seat();
        newSeat.Signal();






    }
}
