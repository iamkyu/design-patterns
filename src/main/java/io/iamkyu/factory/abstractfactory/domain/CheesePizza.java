package io.iamkyu.factory.abstractfactory.domain;

import io.iamkyu.factory.abstractfactory.PizzaIngredientFactory;

public class CheesePizza extends AbstractPizza {

    private final PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        factory.createDough();
        factory.createSauce();
        factory.createCheese();
    }
}
