package co.istad.banking.database;

import co.istad.banking.CreditCard;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
        CreditCard creditCard = new CreditCard(11112222,"EAR BUNSONG",10000.0);
//        creditCard.setName(" ");
//        creditCard.setNumber();
        creditCard.setPin(123);
        creditCard.setLimitAmount(10000.0);
        creditCard.setThruDate(LocalDate.now()
                .plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
}
