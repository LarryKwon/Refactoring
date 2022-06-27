package ch07.ExtractClass;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeHumber;

    public String getName(){
        return name;
    }

    public String getTelephoneNumber(){
        return "("+ officeAreaCode + ") " + officeHumber;
    }

    String getOfficeAreaCode(){
        return officeAreaCode;
    }

    void setOfficeAreaCode(String officeAreaCode){
        this.officeAreaCode = officeAreaCode;
    }

    String getOfficeHumber(){
        return officeHumber;
    }

    void setOfficeHumber(String officeHumber){
        this.officeHumber = officeHumber;
    }
}
