package ch06.ReplaceMethodWithObject;

public class Gamma {
    private final Account1 _account;
    private int inputVal;
    private int quantity;
    private int yearToDate;
    private int importantValue1;
    private int importantValue2;
    private int importantValue3;


    public Gamma(Account1 _account, int inputVal, int quantity, int yearToDate) {
        this._account = _account;
        this.inputVal = inputVal;
        this.quantity = quantity;
        this.yearToDate = yearToDate;
    }

    int compute(){
        importantValue1 = (inputVal * quantity) + _account.delta();
        importantValue2 = (inputVal * yearToDate) + 100;

        int importantValue3 = importantValue2 * 7;
        importantThing();
        //기타

        return importantValue3 - 2 * importantValue1;
    }

    void importantThing(){
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
    }
}
