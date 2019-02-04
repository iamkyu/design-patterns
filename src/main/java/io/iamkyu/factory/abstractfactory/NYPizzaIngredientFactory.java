package io.iamkyu.factory.abstractfactory;

import io.iamkyu.factory.abstractfactory.domain.Cheese;
import io.iamkyu.factory.abstractfactory.domain.Clams;
import io.iamkyu.factory.abstractfactory.domain.Dough;
import io.iamkyu.factory.abstractfactory.domain.Pepperoni;
import io.iamkyu.factory.abstractfactory.domain.Sauce;
import io.iamkyu.factory.abstractfactory.domain.Veggies;

import java.util.Collection;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sauce createSauce() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Cheese createCheese() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<Veggies> createVeggies() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Pepperoni createPeperoni() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Clams createClam() {
        throw new UnsupportedOperationException();
    }
}
