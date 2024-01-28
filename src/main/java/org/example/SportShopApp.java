package org.example;

public class SportShopApp {
    public static void main(String[] args) {

        Order order1 = new Order();

        TShirt tShirtRed = new TShirtBuilder()
                .setName("T-Shirt")
                .setManufacturer("Active sports")
                .setPrice(10)
                .setColor(Color.RED)
                .setSize(Size.M)
                .build();

        Cap capWhite = new CapBuilder()
                .setName("Cap")
                .setManufacturer("Smart Caps")
                .setPrice(5)
                .setColor(Color.WHITE)
                .build();

        order1.addProduct(tShirtRed);
        order1.addProduct(capWhite);

        order1.printOrderDetails();

        Order order2 = new Order();

        TShirt tShirtBlue = new TShirtBuilder()
                .setName("T-Shirt")
                .setManufacturer("Active sports")
                .setPrice(10)
                .setColor(Color.BLUE)
                .setSize(Size.L)
                .build();

        Cap capBlack = new CapBuilder()
                .setName("Cap")
                .setManufacturer("Smart Caps")
                .setPrice(5)
                .setColor(Color.BLACK)
                .build();

        order2.addProduct(tShirtBlue);
        order2.addProduct(capBlack);

        order2.printOrderDetails();
    }
}
