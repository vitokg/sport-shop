package org.example;

public enum Size {
    XS, S, M, L, XL, XXL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
