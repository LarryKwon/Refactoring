package ch01.refactoring;

import ch01.refactoring.price.ChildrenPrice;
import ch01.refactoring.price.NewReleasePrice;
import ch01.refactoring.price.Price;
import ch01.refactoring.price.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int _priceCode) {
        switch (_priceCode){
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("가격 코드가 잘못됐습니다.");
        }
    }

    public double getCharge(int daysRented){
        return _price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented){
        return _price.getFrequentRenterPoints(daysRented);
    }
}
