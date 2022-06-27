package ch07.MoveField;

public class Account {

    private AccountType type;
    private double interestsRate;

    double interestForAmountDays(double amount, int days){
        return interestsRate * amount * days / 365;
    }
}
