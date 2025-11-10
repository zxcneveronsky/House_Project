package tree1.house.work;

public class OtvetNaVopros {
    public void proverka() {
        try{
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println("Скип Catch");
        } finally {
            System.out.println(1/0);
        }
    }
    public void proverka2() {
        try{
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println(1/0);
        } finally {
            System.out.println("Finally");
        }
    }
}
