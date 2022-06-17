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
    Movie beforeMovie1;
    Movie beforeMovie2;
    Movie beforeMovie3;

    ch01.refactoring.Movie afterMovie1;
    ch01.refactoring.Movie afterMovie2;
    ch01.refactoring.Movie afterMovie3;

    @BeforeEach
     public void setup(){

        beforeMovie1 = new Movie("movie1", 0);
        beforeMovie2 = new Movie("movie2", 1);
        beforeMovie3 = new Movie("movie3", 2);

        afterMovie1 = new ch01.refactoring.Movie("movie1", 0);
        afterMovie2 = new ch01.refactoring.Movie("movie2", 1);
        afterMovie3 = new ch01.refactoring.Movie("movie3", 2);
    }

    @Test()
    public void validRefactor(){
        before = new ch01.example.Customer("test1");
        after = new Customer("test1");

        ArrayList<ch01.example.Rental> rentalsOfCustomer1 = new ArrayList<>();
        rentalsOfCustomer1.add(new ch01.example.Rental(beforeMovie1, 3));
        rentalsOfCustomer1.add(new ch01.example.Rental(beforeMovie2, 1));
        rentalsOfCustomer1.add(new ch01.example.Rental(beforeMovie3, 2));

        for (ch01.example.Rental rental : rentalsOfCustomer1) {
            before.addRental(rental);
        }

        ArrayList<Rental> rentalsOfCustomer2 = new ArrayList<>();
        rentalsOfCustomer2.add(new Rental(afterMovie1, 3));
        rentalsOfCustomer2.add(new Rental(afterMovie2, 1));
        rentalsOfCustomer2.add(new Rental(afterMovie3, 2));
        for (Rental rental : rentalsOfCustomer2) {
            after.addRental(rental);
        }

        assertEquals(before.statement(), after.statement());
    }
}
