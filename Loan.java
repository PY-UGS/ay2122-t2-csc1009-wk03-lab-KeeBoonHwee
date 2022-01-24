import java.util.Date;
import java.lang.Math;

public class Loan
{
    // Private variables
    private double annualInterestRate;
    private int    numberOfYears;
    private double loanAmount;
    private Date   loanDate;

    // Constructors
    public Loan()
    {
        this.loanDate = new Date();
        this.annualInterestRate = 2.5;  // default values
        this.numberOfYears = 1;         // default values
        this.loanAmount = 1000;         // default values
    }

    public Loan(double annualInterestRate,
                int    numberOfYears,
                double loanAmount
               )
    {
        this.loanDate = new Date();
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
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

    // Setters

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    //----------------------------------------

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        double compoundInterest = Math.pow( 1 + monthlyInterestRate, this.numberOfYears * 12) ;
        return (( this.loanAmount * monthlyInterestRate ) / (1 - 1/compoundInterest));
    }

    public double getTotalPayment()
    {
        return (this.getMonthlyPayment() * this.numberOfYears * 12);
    }
}