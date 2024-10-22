package app.HW12;

public class Car {

    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();

    }
    private void startElectricity(){
        System.out.println("Electricity is on");
    }
    private void startCommand(){
        System.out.println("Car checked");

    }
    private void startFuelSystem(){
        System.out.println("Fuel enough");

    }
}
