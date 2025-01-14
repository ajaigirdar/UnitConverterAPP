package model;

public abstract class Unit {
    private String name;
    private double value;
    public Unit(String name, double value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;

    } public double getValue() {
        return value;
    }

    public abstract double convertTo(Unit targetUnit);
}
