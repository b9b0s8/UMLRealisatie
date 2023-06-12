public class Truck extends Car implements PriceTemplate{
    int carryingCapacity;

    public Truck(boolean isRented, boolean isInsured, Customer customer, double weight, int carryingCapacity) {
        super(isRented, isInsured, customer, weight);
        this.carryingCapacity = carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public double calcPrice(boolean isInsured) {
        return(carryingCapacity * .1 + (isInsured ? getWeight() * .01 : 0));
    }
}
