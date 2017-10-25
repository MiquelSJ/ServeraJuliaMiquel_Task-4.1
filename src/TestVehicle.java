import transport.Vehicle;

public class TestVehicle {
    public static void main(String args[]) {
        Vehicle myVehicle = new Vehicle(10000);

        System.out.println(myVehicle.addBox(900));
        System.out.println(myVehicle.addBox(10000));
        System.out.println("ºººººººººº");
        System.out.println("La carrega màxima és de "+myVehicle.getMaxLoad()+" Kg.");

    }

}