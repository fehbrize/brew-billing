package Model;

public class Sugar extends AddOn{
    public Sugar(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public String getDescription() {
        return this.getBeverage().getDescription() + " with Sugar";
    }

    @Override
    public double cost() {
        return 0.15;
    }
}
