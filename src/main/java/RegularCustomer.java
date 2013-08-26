
public class RegularCustomer extends Customer {
    public RegularCustomer(){
        super("Regular");
    }

    @Override
    public boolean isRegular() {
        return true;
    }

    @Override
    public boolean isRewardee() {
        return false;
    }
}
