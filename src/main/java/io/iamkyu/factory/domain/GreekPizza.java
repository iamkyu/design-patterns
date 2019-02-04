package io.iamkyu.factory.domain;

public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void bake() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void cut() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void box() {
        throw new UnsupportedOperationException();
    }
}
