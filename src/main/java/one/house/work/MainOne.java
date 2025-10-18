package one.house.work;

public class MainOne {
    public static void main(String[] args) {

        BankAccount myBankAccount = new BankAccount( 123321 );
//    myBankAccount.accountNumber = 123 ; -> невозможно т.к accountNumber -> final.
        System.out.println(myBankAccount.getAccountNumber());

//        Child myChild = new Child();
//        myChild.displayMessage();
//        System.out.println(myChild.a);








    }
}