package Model;

public class BlondeRoast extends Beverage{

    public BlondeRoast() {
        super("Blonde roast");
    }

    @Override
    public double cost() {
        return 2.95;
    }
}
