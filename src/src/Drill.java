public class Drill extends Rental implements PriceTemplate{
    private String model;
    private String type;
    private double rentPrice;

    public Drill(boolean isRented, boolean isInsured, Customer customer, String model, String type) {
        super(isRented, isInsured, customer);
        this.model = model;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return(rentPrice + (isInsured ? 1 : 0-0));
    }
}
