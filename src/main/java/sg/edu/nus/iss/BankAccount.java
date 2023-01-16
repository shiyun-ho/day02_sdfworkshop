package sg.edu.nus.iss;

public class BankAccount {
    //all members should be private, with getters and setters 
    //final means we are not allowed to change
    private final String accountNo; 
    private String fullName; 
    private double balance = 0.0; 
    private boolean isActive = true;   
    private Date accountStartDate; 
    private Date accountEndDate;
    

    public BankAccount(String fullName, double balance) {
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    } 

    
}
