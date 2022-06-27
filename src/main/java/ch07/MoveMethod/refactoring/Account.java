package ch07.MoveMethod.refactoring;

import ch07.MoveMethod.refactoring.AccountType;

public class Account {
    private AccountType type;
    private int daysOverdrawn;

    double bankCharge(){
        double result = 4.5;
        if(daysOverdrawn > 0) result += type.overdraftCharge(daysOverdrawn);
        return result;
    }
}

/*
    필드 하나만을 넘겨주면 되니까 이렇게 했지만
    여러 필드를 이용해야한다면 this를 넘기면 된다.
 */
