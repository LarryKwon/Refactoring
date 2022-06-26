package ch06.ReplaceMethodWithObject;

public class Account1 {
    public int gamma(int inputVal, int quantity, int yearToDate) {
        return new Gamma(this, inputVal, quantity, yearToDate).compute();
    }

    public int delta() {
        return 100;
    }
}
