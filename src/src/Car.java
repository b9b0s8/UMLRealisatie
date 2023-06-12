public class Car extends Rental{
    private double weight;

    public Car(boolean isRented, boolean isInsured, Customer customer, double weight) {
        super(isRented, isInsured, customer);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
