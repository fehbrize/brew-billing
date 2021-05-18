package Model;

public class MedRoast extends Beverage{
    public MedRoast() {
        super("Medium roast");
    }

    @Override
    public double cost() {
        return 2.95;
    }
}
