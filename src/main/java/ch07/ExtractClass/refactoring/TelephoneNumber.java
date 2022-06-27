package ch07.ExtractClass.refactoring;

public class TelephoneNumber {

    private String areaCode;
    private String number;

    public String getTelephoneNumber(){
        return "("+ areaCode + ") " + number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
