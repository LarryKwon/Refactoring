package ch07.HideDelegate.refactoring;

import ch07.HideDelegate.refactoring.Person;

public class Department {

    private String chargeCode;
    private Person manager;

    public Department(Person manager){
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
