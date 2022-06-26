package ch06.InlineMethod;

public class InlineMethod1 {

    private Integer numberOfLateDelivers;

    public int getRating(){
        return (numberOfLateDelivers > 5)? 2:1;
    }
}
