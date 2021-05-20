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

  public double calcBill() {
    //get vehical types.
    double bill = 0.00;
    for (int i = 0; i < this.garageList.size(); i++) {
      if (this.garageList.get(i) instanceof car) {
        bill = bill + 12.57;
      } else {
        bill = bill + 5;
      }
    }
    return bill;
  }

  public void removeByID(int Search) {
    if (!this.garageList.isEmpty()) {
      int index = 0;
      for (int i = 0; i < this.garageList.size(); i++) {

        if (this.garageList.get(i).ID == Search) {

          index = i;
        } 
      }
      this.garageList.remove(index);

    } else {
      System.out.println("Nothing in the garage to remove.");
    }
  }

  public void removeAll(){
    if (!this.garageList.isEmpty()) {
      this.garageList.clear();
    } else {
      System.out.println("Nothing in the garage to remove.");
    }
  }

  public void printList() {
    if (!this.garageList.isEmpty()) {
      System.out.println("");
      System.out.println(this.garageList.iterator().next().toString());
    } else {
      System.out.println("Sorry! You have no cars!");
    }
  }
}
