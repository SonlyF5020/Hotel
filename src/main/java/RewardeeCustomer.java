
public class RewardeeCustomer extends Customer {
    public RewardeeCustomer(){
        super("Rewardee");
    }

    @Override
    public boolean isRegular() {
        return false;
    }

    @Override
    public boolean isRewardee() {
        return true;
    }
}
