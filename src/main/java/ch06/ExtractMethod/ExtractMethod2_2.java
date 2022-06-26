package ch06.ExtractMethod;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod2_2 {

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
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    /*
    여기서 outstanding은 초기화할 때만 쓰이므로, 빼낸 메서드 안에서만 초기화할 수 있다.
    하지만 더 복잡한 작업이 일어날 땐, 이전 값을 매개변수로 전달해야함.
     */
    public double getOutstanding(){
        Enumeration e = orders.elements();
        double result = 0.0;

        while(e.hasMoreElements()){
            Order each = (Order) e. nextElement();
            result += each.getAmount();
        }
        return result;
    }

}
