package ch01.example;

import ch01.example.Movie;
import ch01.example.Rental;
import ch01.refactoring.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    Customer test1;
    Customer test2;
    Customer test3;

    Movie movie1;
    Movie movie2;
    Movie movie3;

    @BeforeEach
     public void setup(){
        test1 = new Customer("test1");
        test2 = new Customer("test2");
        test3 = new Customer("test3");

        movie1 = new Movie("movie1", 0);
        movie2 = new Movie("movie2", 1);
        movie3 = new Movie("movie3", 2);
    }

    @Test()
    public void test1(){
        ArrayList<Rental> rentalsOfCustomer1 = new ArrayList<>();
        rentalsOfCustomer1.add(new Rental(movie1, 3));
        rentalsOfCustomer1.add(new Rental(movie2, 1));
        rentalsOfCustomer1.add(new Rental(movie3, 2));

        for (Rental rental : rentalsOfCustomer1) {
            test1.addRental(rental);
        }

        ArrayList<Rental> rentalsOfCustomer2 = new ArrayList<>();
        rentalsOfCustomer2.add(new Rental(movie1, 3));
        rentalsOfCustomer2.add(new Rental(movie2, 1));
        rentalsOfCustomer2.add(new Rental(movie3, 2));
        for (Rental rental : rentalsOfCustomer2) {
            test2.addRental(rental);
        }

        assertEquals(test1.statement(), test2.statement());
    }


}
