/*Paquet transport que importam després a TestVehicle.java*/
package transport;
/*Classe pública Vehicle*/
public class Vehicle {
/*Atributs privats de load=carrega i maxLoad=carrega màxima*/
    private double load;
    private double maxLoad;
/*Mètodes*/
    public Vehicle (double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }
/*Si la caixa hi cap fa això*/
    public boolean addBox (double weight) {
         if (weight+load <= maxLoad) {
             this.load = weight + this.load;
             System.out.println("ºººººººººº");
             System.out.println("La caixa pesa "+weight+" Kg.");
             System.out.println("Hi podem afegir "+(maxLoad-load+" Kg més."));

             return true;

         }
/*Si no hi cap dedins el camió treurà un error*/
         else {
             System.out.println("ºººººººººº");
             System.out.println("Aquesta caixa no hi cap perquè pesa "+weight+" Kg.");
             return false;
         }
    }
}
