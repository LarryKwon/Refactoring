package ch07.MoveField.refactoring;

public class Account {

    private AccountType type;

    double interestForAmountDays(double amount, int days){
        return type.getInterestRate() * amount * days / 365;
    }

    double interestForAmountDays1(double amount, int days){
        return getInterestRate() * amount * days / 365;
    }

    private void setInterestRate(double interestRate){
        type.setInterestRate(interestRate);
    }

    private double getInterestRate(){
        return type.getInterestRate();
    }
}
/*
많은 메서드가 interestRate 필드를 사용한다면 필드 자체 캡슐화를 실시해야 함.
-> 만약에 이렇게 해놨다가, 메서드를 이동하고 싶다고 할 때, 예를 들어 interestForAmountDays1 메서드를 accountType 안으로 옮기고 싶다고 할 때,
메서드를 전혀 수정하지 않아도 돌다간다.
 */
