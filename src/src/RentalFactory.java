public class RentalFactory implements Observer{
    RentalFactory(Customer customer, boolean isRented, boolean isInsured, int weight, String model){
        Rental newCar = new PersonCar(isInsured, isRented, customer, weight, model);
        newCar.add(this);
        update();
    }
    RentalFactory(Customer customer, boolean isRented, boolean isInsured, int weight, int carryingCapacity){
        Rental newTruck = new Truck(isInsured, isRented, customer, weight, carryingCapacity);
        newTruck.add(this);
        update();
    }
    RentalFactory(Customer customer, boolean isRented, boolean isInsured, String model, String type){
        Rental newDrill = new Drill(isInsured, isRented, customer, model, type);
        newDrill.add(this);
        update();
    }
    @Override
    public void update(){
        System.out.println("Update complete");
    }
}

