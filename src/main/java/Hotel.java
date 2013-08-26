
public class Hotel {
    private int weekdayPriceForRegular;
    private int weenendPriceForRegular;

    private int weekdayPriceForRewardee;
    private int weekendPriceForRewardee;

    public int getWeekdayPriceForRegular() {
        return weekdayPriceForRegular;
    }

    public int getWeenendPriceForRegular() {
        return weenendPriceForRegular;
    }

    public int getWeekdayPriceForRewardee() {
        return weekdayPriceForRewardee;
    }

    public int getWeekendPriceForRewardee() {
        return weekendPriceForRewardee;
    }

    public Hotel(int weekdayPriceForRegular, int weekendPriceForRegular, int weekdayPriceForRewardee, int weekendPriceForRewardee) {
        this.weekdayPriceForRegular = weekdayPriceForRegular;
        this.weenendPriceForRegular = weekendPriceForRegular;
        this.weekdayPriceForRewardee = weekdayPriceForRewardee;
        this.weekendPriceForRewardee = weekendPriceForRewardee;
    }
}
