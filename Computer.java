public class Computer {
    private float sizeInches;
    private float weightKg;
    private String color;
    private short capacityRam;
    private float priceEur;

    public Computer() {
        this.sizeInches = 15.4f;
        this.weightKg = 2.16f;
        this.color = "white";
        this.capacityRam = 4;
        this.priceEur = 199.45f;
    }

    public Computer (float inputSizeInches, float inputWeightKg, String inputColor, short inputCapacityRam, float inputPriceEur){
        this.sizeInches = inputSizeInches;
        this.weightKg = inputWeightKg;
        this.color = inputColor;
        this.capacityRam = inputCapacityRam;
        this.priceEur = inputPriceEur;
    }

    public float getSizeInches() {
        return sizeInches;
    }

    public float getWeightKg() {
        return weightKg;
    }

    public String getColor() {
        return color;
    }

    public short getCapacityRam() {
        return capacityRam;
    }

    public float getPriceEur() {
        return priceEur;
    }
}
