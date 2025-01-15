package model;

public enum LengthConversionOption {
    KILOMETERS_TO_METERS,
    METERS_TO_KILOMETERS,
    INCHES_TO_FEET,
    FEET_TO_INCHES;

    public String toString() {
        return switch (this) {
            case KILOMETERS_TO_METERS -> "Kilometers to Meters";
            case METERS_TO_KILOMETERS -> "Meters to Kilometers";
            case INCHES_TO_FEET -> "Inches to Feet";
            case FEET_TO_INCHES -> "Feet to Inches";
            default -> super.toString();
        };
    }
}