package model;

public class LengthUnit extends Unit{
    public LengthUnit(String name, double value) {
        super(name, value);
    }

    @Override
    public double convertTo(Unit targetUnit) {
        return 0;
    }


}
