package model;

public class LengthUnit extends Unit{

    public enum LengthType {
        KILOMETERS("Kilometer", 1000),
        METERS("Meters", 1),
        INCHES("Inches", 39.37),
        FEET("Feet", 3.281);

        private final String name;
        private final double conversionFactor;

        LengthType(String name, double conversionFactor){
            this.name = name;
            this.conversionFactor = conversionFactor;
        }

        public String getName() {
            return name;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }

        public static LengthType fromString(String name) {
            for (LengthType type : LengthType.values()) {
                if (type.name.equalsIgnoreCase(name)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Unsupported length Type");
        }
    }

    private LengthType type;

    public LengthUnit(LengthType type, double value) {
        super(value);
        this.type = type;
    }


    @Override
    public double convertTo(Unit targetUnit) {
        return 0;
    }
}
