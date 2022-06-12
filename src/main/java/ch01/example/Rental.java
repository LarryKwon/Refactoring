package ch01.example;


public class Rental {

    private Movie _movie;
    private int _DaysRented;

    public Rental(Movie _movie, int _DaysRented) {
        this._movie = _movie;
        this._DaysRented = _DaysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _DaysRented;
    }
}
