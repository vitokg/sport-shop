package org.example;

public class Cap extends Product {
    Color color;

    public Cap(String name, String manufacturer, double price, Color color) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cap{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
