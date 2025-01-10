package lang.immutable.test;

public class ImmutableMyDate {
    final private int year;
    final private int month;
    final private int day;
    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ImmutableMyDate setYear(int year) {
        return new ImmutableMyDate(year,month,day);
    }
//    public void setMonth(int month) {
//        this.month = month;
//    }
//    public void setDay(int day) {
//        this.day = day;
//    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
