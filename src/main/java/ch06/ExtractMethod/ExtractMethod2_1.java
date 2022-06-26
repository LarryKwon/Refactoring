package ch06.ExtractMethod;

import java.util.Enumeration;
import java.util.Vector;



public class ExtractMethod2_1 {

    private String name;
    private String amount;
    private Vector orders = new Vector();

    public void printBanner(){
        System.out.println("************");
        System.out.println("***고객 외상***");
        System.out.println("************");
    }

    public void printDetails(double outstanding) {
        //세부 정보 출력
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    public void printOwing(double amount){
        Enumeration e = orders.elements();
        double outstanding = 0.0;

        printBanner();

        while(e.hasMoreElements()){
            Order each = (Order) e. nextElement();
            outstanding += each.getAmount();
        }

        printDetails(outstanding);
    }
}

/*
    복잡한 경우는 지역 변수로의 값 대입이다.
    임시변수만 생각하면 됨.

    - 임시변수가 추출한 코드 안에서만 사용되는 경우
        추출한 코드로 옮기면 된다.
    - 임시변수가 추출한 코드 밖에서 사용되는 경우
        코드가 추출된 후 사용되지 않는다면, 추출한 코드에서 임시변수를 반환하도록 수정해야함.
 */
