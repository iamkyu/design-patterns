package io.iamkyu.factory.abstractfactory.domain;

public abstract class AbstractPizza {

    abstract void prepare();

    void bake() {
        throw new UnsupportedOperationException();
    }

    void cut() {
        throw new UnsupportedOperationException();
    }

    void box() {
        throw new UnsupportedOperationException();
    }
}
