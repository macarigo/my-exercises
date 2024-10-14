public enum Importance {
    LOW(0),
    MEDIUM(1),
    HIGH(2);

    private int level;

    Importance(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
