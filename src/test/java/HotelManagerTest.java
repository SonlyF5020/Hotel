import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HotelManagerTest {
    @Test
    public void shouldGive_120_when_regular_customer_come_at_saturday(){
        Customer regularCustomer = new RegularCustomer();
        HotelManager hotelManager = new HotelManager();
        ComingDate date = new ComingDate("sat");
        int price = hotelManager.getLowestPriceFor(regularCustomer,date);
        assertThat(price,is(120));
    }

    @Test
    public void shouldGive_100_when_regular_customer_come_at_monday(){
        Customer regularCustomer = new RegularCustomer();
        HotelManager hotelManager = new HotelManager();
        ComingDate date = new ComingDate("mon");
        int price = hotelManager.getLowestPriceFor(regularCustomer,date);
        assertThat(price,is(100));
    }

    @Test
    public void shouldGive_60_when_rewardee_customer_come_at_saturday(){
        Customer rewardeeCustomer = new RewardeeCustomer();
        HotelManager hotelManager = new HotelManager();
        ComingDate date = new ComingDate("sat");
        int price = hotelManager.getLowestPriceFor(rewardeeCustomer,date);
        assertThat(price,is(60));
    }

    @Test
    public void shouldGive_90_when_rewardee_customer_come_at_monday(){
        Customer rewardeeCustomer = new RewardeeCustomer();
        HotelManager hotelManager = new HotelManager();
        ComingDate date = new ComingDate("mon");
        int price = hotelManager.getLowestPriceFor(rewardeeCustomer,date);
        assertThat(price,is(90));
    }
}
