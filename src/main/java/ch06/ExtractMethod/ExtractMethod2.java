package ch06.ExtractMethod;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Vector;


public class ExtractMethod2 {

    private String name;
    private String amount;
    private Vector orders = new Vector();

    public void printBanner(){
        System.out.println("Banner");
    }

    public void printOwing(){
        Enumeration e = orders.elements();
        double outstanding = 0.0;

        System.out.println("************");
        System.out.println("***고객 외상***");
        System.out.println("************");

        while(e.hasMoreElements()){
            Order each = (Order) e. nextElement();
            outstanding += each.getAmount();
        }

        //세부 정보 출력
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }
}
