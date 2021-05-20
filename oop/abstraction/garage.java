package oop.abstraction;

import java.util.List;

public class garage {

  protected List<vehical> garageList;

  public garage(List<vehical> garageList) {
    this.garageList = garageList;
  }

  public void addLocomotive(vehical loco) {
    this.garageList.add(loco);
  }

  public void removeLocomotive(vehical loco) {
    this.garageList.remove(loco);
  }

  public void printList() {
    if (!this.garageList.isEmpty()) {
      System.out.println("");
      System.out.println(this.garageList.iterator().next().manufacturer);
      System.out.println(this.garageList.iterator().next().model);
      System.out.println(this.garageList.iterator().next().year);
    } else {
        System.out.println("Sorry! You have no cars!");
    }
  }
}
