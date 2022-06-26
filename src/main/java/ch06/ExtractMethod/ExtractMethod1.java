package ch06.ExtractMethod;

public class ExtractMethod1 {
    private String name;
    private String amount;

    public void printBanner(){
        System.out.println("Banner");
    }

    public void printOwing(double amount){
        printBanner();
        printDetails(amount);
    }

    public void printDetails(double amount){
        //세부 정보 출력
        System.out.println("name: " + name);
        System.out.println("amount: " + amount);
    }
}
