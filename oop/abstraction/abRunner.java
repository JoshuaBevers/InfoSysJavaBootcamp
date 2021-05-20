package oop.abstraction;
import java.util.ArrayList;
import java.util.List;

public class abRunner {

    public static void RUNNER(){
        car Mazda = new car("car", 1992, "Mazda", 4);
        motocycle terry = new motocycle("Clairance", 1992, "GOd HIMSELF", "Granit");
        List<vehical> peronalGarage = new ArrayList<vehical>();
        garage parkingLot = new garage(peronalGarage);
        parkingLot.addLocomotive(Mazda);
        parkingLot.addLocomotive(terry);
        parkingLot.printList();
        parkingLot.removeLocomotive(Mazda);
        parkingLot.printList();
        parkingLot.addLocomotive(terry);
        parkingLot.printList();
    }
    
}
