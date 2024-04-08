package app.utils;

public enum Price{
    ;

    int priceTShirt = 67;
    int priceCap = 78;

    Price(int priceTShirt, int priceCap) {
        this.priceTShirt = priceTShirt;
        this.priceCap = priceCap;
    }

    @Override
    public String toString() {
        return "Price{" +
                "priceTShirt=" + priceTShirt +
                ", priceCap=" + priceCap +
                '}';
    }
}
