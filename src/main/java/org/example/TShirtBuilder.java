package org.example;

public class TShirtBuilder {
    String name;
    String manufacturer;
    double price;
    Color color;
    Size size;

    public TShirtBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public TShirtBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public TShirtBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public TShirtBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public TShirtBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public TShirt build() {
        return new TShirt(name, manufacturer, price, color, size);
    }
}
