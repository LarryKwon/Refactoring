package ch01.example;

import ch01.example.Movie;
import ch01.refactoring.Rental;
import ch01.refactoring.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    ch01.example.Customer before;
    Customer after;
    Customer test3;

    Movie movie1;
    Movie movie2;
    Movie movie3;

    @BeforeEach
     public void setup(){

        movie1 = new Movie("movie1", 0);
        movie2 = new Movie("movie2", 1);
        movie3 = new Movie("movie3", 2);
    }

    @Test()
    public void validRefacotor(){
        before = new ch01.example.Customer("test1");
        after = new Customer("test1");

        ArrayList<ch01.example.Rental> rentalsOfCustomer1 = new ArrayList<>();
        rentalsOfCustomer1.add(new ch01.example.Rental(movie1, 3));
        rentalsOfCustomer1.add(new ch01.example.Rental(movie2, 1));
        rentalsOfCustomer1.add(new ch01.example.Rental(movie3, 2));

        for (ch01.example.Rental rental : rentalsOfCustomer1) {
            before.addRental(rental);
        }

        ArrayList<Rental> rentalsOfCustomer2 = new ArrayList<>();
        rentalsOfCustomer2.add(new Rental(movie1, 3));
        rentalsOfCustomer2.add(new Rental(movie2, 1));
        rentalsOfCustomer2.add(new Rental(movie3, 2));
        for (Rental rental : rentalsOfCustomer2) {
            after.addRental(rental);
        }

        assertEquals(before.statement(), after.statement());
    }
}
