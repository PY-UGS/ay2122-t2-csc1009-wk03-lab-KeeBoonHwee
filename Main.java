import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println("Date is " + date);

        Loan loan = new Loan(date, 8888, 20, 0.08);
        
    }
}
