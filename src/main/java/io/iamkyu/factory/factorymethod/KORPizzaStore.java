package io.iamkyu.factory.factorymethod;

import io.iamkyu.factory.domain.BasicPizza;
import io.iamkyu.factory.domain.Pizza;

public class KORPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return new BasicPizza();
    }
}
