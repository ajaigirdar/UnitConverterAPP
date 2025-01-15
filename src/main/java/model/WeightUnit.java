package model;

public class WeightUnit extends Unit{
    public enum WeightType {
        GRAMS("Grams", 1),
        KILOGRAMS("Kilograms", 1000),
        POUNDS("Pounds", 453.592),
        OUNCES("Ounces", 28.3495);

        private final String name;
        private final double conversionFactor;

        WeightType(String name, double conversionFactor) {
            this.name = name;
            this.conversionFactor = conversionFactor;
        }

        public String getName() {
            return name;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }

        public static WeightType fromString(String name) {
            for (WeightType type : WeightType.values()) {
                if (type.name.equalsIgnoreCase(name)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Unsupported weight unit: " + name);
        }
    }

    private WeightType type;

    public WeightUnit(WeightType type, double value) {
        super(value);
        this.type = type;
    }

    @Override
    public double convertTo(Unit targetUnit) {
        return 0;
    }
}
