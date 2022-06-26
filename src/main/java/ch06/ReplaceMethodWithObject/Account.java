package ch06.ReplaceMethodWithObject;

public class Account {

    public int gamma(int inputVal, int quantity, int yearToDate) {
        int importantVal1 = (inputVal * quantity) + delta();
        int importantVal2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantVal1) > 100)
            importantVal2 -= 20;
        int importantValue3 = importantVal2 * 7;

        //기타

        return importantValue3 - 2 * importantVal1;
    }

    public int delta(){
        return 100;
    }
}
