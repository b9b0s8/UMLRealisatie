public class PersonCar extends Car implements PriceTemplate{
    private String model;
    private double rentPrice = 50;

    public PersonCar(boolean isRented, boolean isInsured, Customer customer, double weight, String model) {
        super(isRented, isInsured, customer, weight);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    @Override
    public double calcPrice(boolean isInsured) {
        return(rentPrice + (isInsured ? getWeight() * .01 : 0));
    }
}
