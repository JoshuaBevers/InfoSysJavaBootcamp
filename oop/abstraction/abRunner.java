package oop.abstraction;
import java.util.ArrayList;
import java.util.List;

public class abRunner {

    public static void RUNNER(){
        car Mazda = new car(1,"car", 1992, "Mazda", 4);
        motocycle terry = new motocycle(2, "Clairance", 1992, "God HIMSELF", "Granit");
        List<vehical> peronalGarage = new ArrayList<vehical>();
        garage parkingLot = new garage(peronalGarage);
        parkingLot.addLocomotive(Mazda);
        parkingLot.addLocomotive(terry);
        double bill = parkingLot.calcBill();
        System.out.println("Bill is: "+ bill + "$");

        parkingLot.printList();
        parkingLot.removeLocomotive(Mazda);
        parkingLot.printList();
        System.out.println("remove by id.");
        parkingLot.removeByID(2);
        parkingLot.printList();


    }
    
}
