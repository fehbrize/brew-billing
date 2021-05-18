package Model;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        super("Dark roast");
    }

    @Override
    public double cost() {
        return 2.95;
    }
}
