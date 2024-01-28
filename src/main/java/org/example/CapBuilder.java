package org.example;

public class CapBuilder {
    String name;
    String manufacturer;
    double price;
    Color color;

    public CapBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CapBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CapBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public CapBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public Cap build() {
        return new Cap(name, manufacturer, price, color);
    }
}
