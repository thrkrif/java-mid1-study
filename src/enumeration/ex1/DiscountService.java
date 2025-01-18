package enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price){
        int discount = 0;

        if(grade.equals(StringGrade.BASIC)){
            discount = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discount = 20;
        }
        else if (grade.equals(StringGrade.DIAMOND)){
            discount = 30;
        }
        else
            System.out.println(grade + ": 할인X");

        return price * discount / 100;
    }
}
