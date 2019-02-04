package io.iamkyu.factory.abstractfactory;

import io.iamkyu.factory.abstractfactory.domain.AbstractPizza;
import io.iamkyu.factory.abstractfactory.domain.CheesePizza;

public class NYPizzaStore implements PizzaStore {

    @Override
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        pizza = new CheesePizza(factory);
        return pizza;
    }
}
