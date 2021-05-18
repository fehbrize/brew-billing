package Model;

public class Milk extends AddOn{
    public Milk(Beverage beverage) {
        super("Milk", beverage);
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + " with Milk";
    }

    @Override
    public double cost() {
        return 0.25;
    }
}
