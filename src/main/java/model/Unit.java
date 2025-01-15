package model;

public abstract class Unit {
    private double value;

    public Unit(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    public abstract double convertTo(Unit targetUnit);

}
