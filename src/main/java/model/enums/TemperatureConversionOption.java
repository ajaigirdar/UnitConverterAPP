package model.enums;

public enum TemperatureConversionOption {
    CELSIUS_TO_FAHRENHEIT,
    FAHRENHEIT_TO_CELSIUS,
    CELSIUS_TO_KELVIN,
    KELVIN_TO_FAHRENHEIT;

    public String toString() {
        return switch (this) {
            case CELSIUS_TO_FAHRENHEIT -> "Celsius to Fahrenheit";
            case FAHRENHEIT_TO_CELSIUS -> "Fahrenheit to Celsius";
            case CELSIUS_TO_KELVIN -> "Celsius to Kelvin";
            case KELVIN_TO_FAHRENHEIT -> "Kelvin to Celsius";
            default -> super.toString();
        };
    }
}
