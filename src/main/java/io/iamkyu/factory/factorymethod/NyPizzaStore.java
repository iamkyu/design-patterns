package io.iamkyu.factory.factorymethod;

import io.iamkyu.factory.domain.BasicPizza;
import io.iamkyu.factory.domain.CheesePizza;
import io.iamkyu.factory.domain.GreekPizza;
import io.iamkyu.factory.domain.PepperoniPizza;
import io.iamkyu.factory.domain.Pizza;

import static io.iamkyu.factory.domain.PizzaType.CHEESE;
import static io.iamkyu.factory.domain.PizzaType.GREEK;
import static io.iamkyu.factory.domain.PizzaType.PEPPERONI;

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        if (CHEESE.getValue().equals(type)) {
            pizza = new CheesePizza();
        } else if (GREEK.getValue().equals(type)) {
            pizza = new GreekPizza();
        } else if (PEPPERONI.getValue().equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            pizza = new BasicPizza();
        }

        return pizza;
    }
}
