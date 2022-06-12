package ch01.refactoring;

import ch01.refactoring.Movie;

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

    public double getCharge() {
        return _movie.getCharge(_DaysRented);
    }

    int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(_DaysRented);
    }
}
