package model;

public class TemperatureUnit extends Unit{

    public enum TemperatureType {
        CELSIUS("Celsius"),
        FAHRENHEIT("Fahrenheit"),
        KELVIN("Kelvin");

        private final String name;

        TemperatureType(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public static TemperatureType fromString(String name) {
            for (TemperatureType type : TemperatureType.values()) {
                if (type.name.equalsIgnoreCase(name)) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Unsupported temperature unit: " + name.toUpperCase());
        }
    }

    private TemperatureType type;

    public TemperatureUnit(TemperatureType type, double value) {
        super(value);
        this.type = type;
    }



    @Override
    public double convertTo(Unit targetUnit) {
        return 0;
    }
}
