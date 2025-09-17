package bankingTransaction;

import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
         Transaction transaction = new Transaction();
       //Transaction.TRANSACTION_FEE = 20;
//        transaction.performTransaction(5000, "Deposit");
//        transaction.performTransaction(500, "Withdrawal");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the type(deposit/withdrwal)");
        String type=sc.nextLine();
        System.out.println("enter the amount");
        int amount=sc.nextInt();
        transaction.performTransaction(amount, type); 

        sc.close();
    }
}
