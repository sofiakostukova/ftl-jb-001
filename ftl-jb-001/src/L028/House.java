package L028;

public class House {
    private Boolean hasGarage;
    private Boolean hasSwimingPool;
    private Boolean hasFancyStatues;
    private Boolean hasGarden;

    public static class Builder {
        private Boolean hasGarage = false;
        private Boolean hasSwimingPool = false;
        private Boolean hasFancyStatues = false;
        private Boolean hasGarden = false;


        public void Builder() {

        }


        public Builder optHasGarage(Boolean val) {
            this.hasGarage = val;
            return this;
        }

        public Builder optHasSwimingPool(Boolean val) {
            this.hasSwimingPool = val;
            return this;
        }

        public Builder optHasFancyStatues(Boolean val) {
            this.hasFancyStatues = val;
            return this;
        }

        public Builder optHasGarden(Boolean val) {
            this.hasGarden = val;
            return this;
        }

        public House build() {
            return  new House(this);
        }
    }

    public House(Builder builder){
        this.hasFancyStatues = builder.hasFancyStatues;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasSwimingPool = builder.hasSwimingPool;
    }


    @Override
    public String toString() {
        return "House{" +
                "hasGarage=" + hasGarage +
                ", hasSwimingPool=" + hasSwimingPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
