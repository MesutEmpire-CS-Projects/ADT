public class Date {
    private final int day,month,year;
    Date(int d,int m,int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return this.getDay()+"/"+this.getMonth()+"/"+this.getYear();
    }
}
