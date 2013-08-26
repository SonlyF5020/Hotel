
public class ComingDate {
    private String comingDate;

    public ComingDate(String date) {
        this.comingDate = date;
    }

    public boolean isWeekend(){
        return comingDate.equalsIgnoreCase("sat") || comingDate.equalsIgnoreCase("sun");
    }

    public boolean isWeekday(){
        return !isWeekend();
    }
}
