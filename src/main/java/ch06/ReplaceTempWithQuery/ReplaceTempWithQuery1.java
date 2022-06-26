package ch06.ReplaceTempWithQuery;

public class ReplaceTempWithQuery1 {
    private int _quantity;
    private int _itemPrice;

    public double getPrice(){
        return basePrice() * discountFactor();
    }

    private int basePrice(){
        return _quantity * _itemPrice;
    }

    private double discountFactor(){
        if(basePrice() > 1000) return 0.95;
        else return 0.98;
    }
}
