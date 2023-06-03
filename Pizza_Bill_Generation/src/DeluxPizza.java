public class DeluxPizza extends Pizza{

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraChese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraChese() {

    }

    @Override
    public void addExtraToppings() {
    }
}
