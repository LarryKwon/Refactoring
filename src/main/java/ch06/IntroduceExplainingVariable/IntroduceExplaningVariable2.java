package ch06.IntroduceExplainingVariable;

public class IntroduceExplaningVariable2 {
    private int _quantity;
    private int _itemPrice;

    double price() {
        return basePrice() - quantityDiscount() + shipping();
    }

    private double basePrice() {
        return _quantity * _itemPrice;
    }

    private double quantityDiscount() {
        return Math.max(0, _quantity - 500) * _itemPrice * 0.05;
    }

    private double shipping() {
        return Math.min(basePrice() * 0.1, 100.0);
    }
}
