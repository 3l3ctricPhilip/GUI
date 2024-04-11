public enum Country {
    PL("Polska"),
    NL("Nederland"),
    DE("Deutschland");

    private final String fullName;

    Country(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
