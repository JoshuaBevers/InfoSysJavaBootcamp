import arrays.arraylooping;
import classes.book;
import fizzbuzz.buzzy;
import java.util.ArrayList;
import java.util.List;
import oop.Employee;
import oop.abstraction.car;
import oop.abstraction.garage;
import oop.abstraction.motocycle;
import oop.abstraction.vehical;
import oop.bird;
import oop.duck;

public class runner {

  public static void main(String[] args) {
    //fizzbuzz
    // system.out.println(buzzy.fizzybuzz()); runs fuzzbuzz

    //array loop
    // arraylooping.arrayloops();

    //classes
    // book George = new book("GeorgeSmash!", true, "Moon Speak", "Philosophy");
    // System.out.println(George.getName());

    // oop
    // bird exampBird = new bird("hawk", false, 1, true, "Some", 2, 3);
    // Employee James = new Employee("James", 20, "Annoying", 52);
    // System.out.println(James.calculateWeeklySalary());

    // oop.abstraction
    car Mazda = new car("car", 1992, "Mazda", 4);
    motocycle terry = new motocycle("Clairance", 1992, "GOd HIMSELF", "Granit");
    List<vehical> peronalGarage = new ArrayList<vehical>();
    garage parkingLot = new garage(peronalGarage);
    parkingLot.addLocomotive(Mazda);
    parkingLot.addLocomotive(terry);
    parkingLot.printList();
    parkingLot.removeLocomotive(Mazda);
    parkingLot.printList();
    parkingLot.addLocomotive(Mazda);
    parkingLot.printList();



  }
}
