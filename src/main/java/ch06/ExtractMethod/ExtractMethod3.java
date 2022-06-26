package ch06.ExtractMethod;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod3 {

    private String name;
    private String amount;
    private Vector orders = new Vector();

    public void printBanner(){
        System.out.println("************");
        System.out.println("***고객 외상***");
        System.out.println("************");
    }


    /*
    기존의 메서드 내에서만 초기화되는 것이 아니라면 아래와 같이 매개변수로 넘겨야 한다.
     */
    public void printDetails(double outstanding) {
        //세부 정보 출력
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    public void printOwing(double previousAmount){
        printBanner();
        double outstanding = getOutstanding(previousAmount * 1.2);
        printDetails(outstanding);
    }

    public double getOutstanding(double initialValue){
        Enumeration e = orders.elements();
        double result = initialValue;

        while(e.hasMoreElements()){
            Order each = (Order) e. nextElement();
            result += each.getAmount();
        }
        return result;
    }

    /*
    변수를 두 개 이상 반환해야할 땐 어쩌냐?
    - 각기 다른 값을 하나씩 반환하는 여러 개의 메서드를 만드는 방법을 사용해라
    - 임시변수가 너무 많으면 추출하기가 아주 어려워질 수 있다. 임시변수를 메서드 호출로 전환을 실시해서 임시변수 수를 줄이자.
     */
}
