package oop.abstraction;

public class motocycle extends vehical {
    protected String repairShops;

    public motocycle(String model, int year, String manufacturer, String repairShops) {
        super(model, year, manufacturer);
        this.repairShops = repairShops;
    }

    public String getRepairShops() {
        return repairShops;
    }

    public void setRepairShops(String repairShops) {
        this.repairShops = repairShops;
    }

    @Override
    public String toString() {
      return (
        "Model: " +
        this.model +
        "\n" +
        "Year: " +
        this.year +
        "\n" +
        "Manufacturer: " +
        this.manufacturer +
        "\n" +
        "Repair shops: " +
        this.repairShops +
        "\n"
      );
    }
    
}