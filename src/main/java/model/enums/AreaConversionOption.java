package model.enums;

public enum AreaConversionOption {
    SQUARE_METERS_TO_SQUARE_KILOMETERS,
    SQUARE_KILOMETERS_TO_SQUARE_METERS,
    ACRES_TO_HECTARES,
    HECTARES_TO_ACRES;

    @Override
    public String toString() {
        return switch (this) {
            case SQUARE_METERS_TO_SQUARE_KILOMETERS -> "Square Meters to Meters";
            case SQUARE_KILOMETERS_TO_SQUARE_METERS -> "Meters to Square Meters";
            case ACRES_TO_HECTARES -> "Acres to Hectares";
            case HECTARES_TO_ACRES -> "Hectares to Acres";
            default -> super.toString();
        };
    }
}
