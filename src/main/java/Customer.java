
public abstract class Customer {
    private String customerType;

    public Customer(String type) {
        this.customerType = type;
    }

    public abstract boolean isRegular();

    public abstract boolean isRewardee();
}
