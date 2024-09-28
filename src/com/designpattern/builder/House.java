package com.designpattern.builder;
public class House {
    // Required parameters
    private final String foundation;
    private final String structure;
    private final String roof;
    
    // Optional parameters
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasStatues;
    private final boolean hasGarden;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasStatues = builder.hasStatues;
        this.hasGarden = builder.hasGarden;
    }

    // Getters
    public String getFoundation() { return foundation; }
    public String getStructure() { return structure; }
    public String getRoof() { return roof; }
    public boolean hasGarage() { return hasGarage; }
    public boolean hasSwimmingPool() { return hasSwimmingPool; }
    public boolean hasStatues() { return hasStatues; }
    public boolean hasGarden() { return hasGarden; }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasStatues=" + hasStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class HouseBuilder {
        // Required parameters
        private final String foundation;
        private final String structure;
        private final String roof;
        
        // Optional parameters - initialized to default values
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasStatues;
        private boolean hasGarden;

        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setStatues(boolean hasStatues) {
            this.hasStatues = hasStatues;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
