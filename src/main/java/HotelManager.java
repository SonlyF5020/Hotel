import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    List<Hotel> hotels = new ArrayList<Hotel>();

    public HotelManager() {
        Hotel x = new Hotel(100,120,90,60);
        Hotel y = new Hotel(130,150,100,95);
        Hotel z = new Hotel(195,150,120,90);
        hotels.add(x);
        hotels.add(y);
        hotels.add(z);
    }

    public int getLowestPriceFor(Customer specificCustomer, ComingDate date){
        if (date.isWeekday()){
            return getWeekdayLowestPrice(specificCustomer);
        }
        if (date.isWeekend()){
            return getWeekendLowestPrice(specificCustomer);
        }
        return 0;
    }

    private int getWeekendLowestPrice(Customer specificCustomer) {
        int lowestPrice;
        if (specificCustomer.isRegular()){
            lowestPrice = hotels.get(0).getWeenendPriceForRegular();
            for (Hotel hotel:hotels){
                if (hotel.getWeenendPriceForRegular()<lowestPrice){
                    lowestPrice = hotel.getWeenendPriceForRegular();
                }
            }
            return lowestPrice;
        }
        if (specificCustomer.isRewardee()){
            lowestPrice = hotels.get(0).getWeekendPriceForRewardee();
            for (Hotel hotel:hotels){
                if (hotel.getWeekendPriceForRewardee()<lowestPrice){
                    lowestPrice = hotel.getWeekendPriceForRewardee();
                }
            }
            return lowestPrice;
        }
        return 0;
    }

    private int getWeekdayLowestPrice(Customer specificCustomer) {
        int lowestPrice;
        if (specificCustomer.isRegular()){
            lowestPrice = hotels.get(0).getWeekdayPriceForRegular();
            for (Hotel hotel:hotels){
                if (hotel.getWeekdayPriceForRegular()<lowestPrice){
                    lowestPrice = hotel.getWeekdayPriceForRegular();
                }
            }
            return lowestPrice;
        }
        if (specificCustomer.isRewardee()){
            lowestPrice = hotels.get(0).getWeekdayPriceForRewardee();
            for (Hotel hotel:hotels){
                if (hotel.getWeekdayPriceForRewardee()<lowestPrice){
                    lowestPrice = hotel.getWeekdayPriceForRewardee();
                }
            }
            return lowestPrice;
        }
        return 0;
    }
}
