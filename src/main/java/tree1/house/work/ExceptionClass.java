package tree1.house.work;

public class ExceptionClass {
    public void exceptionsMetod(int a) {
        if (a < 0) {
            throw new ArithmeticException("Корни из отрицательных чиселок не считаю!)");
        } else {
            for (int i = 0; i <= a; i++) {
                if (i * i == a) {
                    System.out.println(i);
                }
            }
        }
    }
}
