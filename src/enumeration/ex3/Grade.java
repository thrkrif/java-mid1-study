package enumeration.ex3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;
    private Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price){
        return price * discountPercent / 100;
    }

}
