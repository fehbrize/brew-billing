package Model;

public abstract class AddOn extends Beverage{
    private final Beverage beverage;

    public AddOn(String description, Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    public abstract String getDescription();

    public Beverage getBeverage() {
        return beverage;
    }
}
