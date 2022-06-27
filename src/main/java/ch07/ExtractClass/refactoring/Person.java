package ch07.ExtractClass.refactoring;

public class Person {
    private String name;
    private String officeHumber;

    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber(){
        return officeTelephone.getTelephoneNumber();
    }
}
