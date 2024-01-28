package org.example;

public class TShirt extends Product {
    Size size;
    Color color;

    public TShirt(String name, String manufacturer, double price, Color color, Size size) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
