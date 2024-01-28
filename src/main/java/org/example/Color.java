package org.example;

public enum Color {
    RED, GREEN, BLUE, YELLOW, BLACK, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
