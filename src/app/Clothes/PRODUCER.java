package app.Clothes;

public enum PRODUCER {

    ACTIVE_SPORTS("Active_sports"),
    SMART_CAPS("Smart caps");

    private final String name;

    PRODUCER(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


