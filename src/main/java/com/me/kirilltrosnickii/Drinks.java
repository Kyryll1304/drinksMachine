package com.me.kirilltrosnickii;

public enum Drinks {
    COFFEE("Coffee", 2.0),
    TEA("Tea", 1.5),
    LEMONADE("Lemonade", 3.0),
    MOJITO("Mojito", 4.0),
    MINERAL_WATER("Mineral Water", 1.0),
    COCA_COLA("Coca Cola", 2.5);

    private final String name;
    private final double price;

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
