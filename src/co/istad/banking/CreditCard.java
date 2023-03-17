package co.istad.banking;
import co.istad.banking.database.Database;

import java.time.LocalDate;
import java.util.Objects;

public class CreditCard extends Account {
    private int pin;
    private Double limitAmount;
    private LocalDate thruDate;

    public CreditCard(){

    }
    public CreditCard(Integer number , String name , Double balance){
        super(number , name , balance);
        //Todo
    }

//    public CreditCard(String name, int number, double balance) {
//        super(name, number, balance);
//    }

    public int getPin() {
        return pin;
    }

    public Double getLimitAmount(double v) {
        return limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }
    @Override
    protected void deposit(Double amount) {
//        super.deposit(amount);
           // What day is today ??
        if (isExpired(thruDate)){
            System.out.println("Card is expired ...!");
            return;
        }
            super.deposit(amount);
        }

        @Override
        protected void withdrawal (Double amount){
//            super.withdrawal(amount);
                if (amount > limitAmount) {
                    System.out.println("Over the limit amount ...!");
                    return;
                }
                LocalDate now = LocalDate.now();
                if (isExpired(thruDate)) {
                    System.out.println("Card is expired..!");
                    return;
                }
                super.withdrawal(amount);
            }
            // Overload method
    // withdrawl entire balance
    protected void withdrawal(){

    }
        @Override
        protected void showBalance(){
                super.showBalance();
                System.out.println("Pin : "+pin);
                System.out.println("Thu Date : "+thruDate);
                System.out.println("Limit Amount : "+limitAmount);
                System.out.println("---------------------");
            }

    private boolean isExpired(LocalDate date){
         //what day is today?
        LocalDate now = LocalDate.now();
        return now.isAfter(date);
    }
}

