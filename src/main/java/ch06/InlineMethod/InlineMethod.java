package ch06.InlineMethod;

public class InlineMethod {


    private Integer numberOfLateDelivers;

    public int getRating(){
        return (moreThanFiveLateDelivers())? 2:1;
    }

    boolean moreThanFiveLateDelivers(){
        return numberOfLateDelivers > 5;
    }
}
