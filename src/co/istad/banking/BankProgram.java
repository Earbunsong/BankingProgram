package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;

public class BankProgram {
    public static void main(String[] args) {
//        Account account = new Account();
//        account.setName("Song");
//        account.setNumber(90);
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(11112222);
        creditCard.setPin(123);
        // Check credit card exists or not
        if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
            creditCard = Database.creditCard();
        }else {
            System.out.println("Invalided");
            return;
        }
        creditCard.deposit(500.0);
//        creditCard.withdrawal(1000.0);
        creditCard.withdrawal();//entire amount
        creditCard.showBalance();
    }
}
