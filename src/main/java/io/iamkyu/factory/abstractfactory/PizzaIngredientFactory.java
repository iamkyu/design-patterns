package io.iamkyu.factory.abstractfactory;

import io.iamkyu.factory.abstractfactory.domain.Cheese;
import io.iamkyu.factory.abstractfactory.domain.Clams;
import io.iamkyu.factory.abstractfactory.domain.Dough;
import io.iamkyu.factory.abstractfactory.domain.Pepperoni;
import io.iamkyu.factory.abstractfactory.domain.Sauce;
import io.iamkyu.factory.abstractfactory.domain.Veggies;

import java.util.Collection;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Collection<Veggies> createVeggies();

    Pepperoni createPeperoni();

    Clams createClam();
}
