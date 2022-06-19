package animals;

public enum MoveType {

    FLY("Летает (fly)"), WALK("Ходит (walk)"), SWIM("Плавает (swim)");

    private String value;

    MoveType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;

    }
}
