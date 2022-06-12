package ch01.refactoring.price;

import ch01.refactoring.Movie;

public class ChildrenPrice extends Price{

    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if(daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
