package io.iamkyu.factory.abstractfactory;

import io.iamkyu.factory.abstractfactory.domain.AbstractPizza;

public interface PizzaStore {
    AbstractPizza orderPizza(String type);
}
