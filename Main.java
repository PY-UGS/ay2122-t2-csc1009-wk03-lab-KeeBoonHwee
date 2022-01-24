import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan(2.5,5,1000);

        System.out.println("Loan annual interest rate is: " + loan.getAnnualInterestRate());

        System.out.println("Loan monthly payment is: " + loan.getMonthlyPayment());
        System.out.println("Loan total payment is: "   + loan.getTotalPayment());
    }
}
