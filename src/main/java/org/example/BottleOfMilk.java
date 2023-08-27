package org.example;

public class BottleOfMilk extends Product{
    private double volume; // oбъем
    private int fat; // жирность

    public BottleOfMilk(String name, String brand, double price, double volume, int fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    @Override
    public String displayInfo() {
        return String.format("%s - %s - %.2f - v: %.2f - f: %d ", name, brand, price, volume, fat);
    }
}
