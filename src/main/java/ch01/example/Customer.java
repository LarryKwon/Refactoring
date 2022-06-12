package ch01.example;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    /*
        사용자 대여 내역을 웹에서도 볼 수 있고, 다른 대중적 형식과도 호환되게끔 출력되길 원한다.
        -> 어느 기능도 HTML 출력에 사용할 수 없음
        -> 결국 방법은 비슷한 걸 복사해서 만드는 수 밖에 없다.
        대여료 적용 규칙을 수정한다면>? -> 똑같이 만든 클래스를 같이 수정해야한다.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRentalPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = getName() + " 고객님의 대여기록 \n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            //비디오 종류별 대여료 계산
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2) {
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3) thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            //적립 포인트 1 증가
            frequentRentalPoints++;
            //최신물 이틀 이상 대여하면 보너스 포인트
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) frequentRentalPoints++;
            // 이번에 대여하는 비디오 정보와 대여료 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }
        //푸터 행
        result += "누적 대여로: " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트: " + String.valueOf(frequentRentalPoints);
        return result;
    }

}
