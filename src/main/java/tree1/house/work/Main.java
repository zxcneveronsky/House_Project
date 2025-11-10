package tree1.house.work;

public class Main {
    public static void main(String[] args) {
        int a = -1;
        ff(a);
        System.out.println();

        a = 5;
        ff(a);
        System.out.println();

        ExceptionClass exceptionClass = new ExceptionClass();
        a = -100;
        try {
            exceptionClass.exceptionsMetod(a);
        } catch (ArithmeticException ea){
            System.out.println(ea.getMessage());
            a = a*(-1);
            System.out.println("Может ты хотел корень из положительного числа? : "+a);
            System.out.println();
            exceptionClass.exceptionsMetod(a);
        }
        System.out.println();


        OtvetNaVopros otvetNaVopros = new OtvetNaVopros();
//       otvetNaVopros.proverka();     >> Скип Catch
//                                      Exception in thread "main" java.lang.ArithmeticException: / by zero
//
//        otvetNaVopros.proverka2();   >> Finally
//                                      Exception in thread "main" java.lang.ArithmeticException: / by zero


    }
    public static int factorial(int n){
        if (n<0){
            throw new ArithmeticException("Ты хочешь факториал от отрицательного числа? - Его не будет.");
        }
        int result = 1;
        for (int i=2; i<=n ; i++ ){
            result = result * i;
        }
        return result;
    }
    public static void ff(int n){
        try {
            System.out.println(factorial(n));
        } catch (ArithmeticException e){ // словили значение, чилл
            System.out.println("1: " + e.getMessage());
            System.out.println("2: Факториал от отрицательных чисел не исчисляем !");
        }
    }
}
