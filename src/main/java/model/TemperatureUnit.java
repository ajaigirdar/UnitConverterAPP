package model;

public class TemperatureUnit extends Unit{

    public TemperatureUnit(String name, double value){
        super(name, value);
    }
    @Override
    public double convertTo(Unit targetUnit) {
        return 0;
    }
}
