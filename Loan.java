import java.util.Date;

public class Loan
{
    // Private variables
    private double annualInterestRate;
    private int    numberOfYears;
    private double loanAmount;
    private Date   loanDate;

    // Constructor
    public Loan(Date   loanDate,
                double loanAmount,
                int    numberOfYears,
                double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    // Getters

    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public int getNumberOfYears()
    {
        return this.numberOfYears;
    }
    public double getLoanAmount()
    {
        return this.loanAmount;
    }
    public Date getLoanDate()
    {
        return this.loanDate;
    }
}