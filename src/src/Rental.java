import java.util.ArrayList;
import java.util.List;

public class Rental implements Observable{
    private List<Observer> observers = new ArrayList<>();
    boolean isRented;
    boolean isInsured;
    Customer customer;

    public Rental(boolean isRented, boolean isInsured, Customer customer) {
        this.isRented = isRented;
        this.isInsured = isInsured;
        this.customer = customer;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers)
            o.update();
    }
}
