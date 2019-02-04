package io.iamkyu.factory.domain;

public enum PizzaType {
    CHEESE("CHEESE"),
    GREEK("GREEK"),
    PEPPERONI("PEPPERONI");

    private final String value;

    PizzaType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
