package com.swufe.guitar;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean matches(GuitarSpec other) {
        return builder == other.builder && model.equalsIgnoreCase(other.model) &&
                type == other.type && numStrings == other.numStrings &&
                backWood == other.backWood && topWood == other.topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
