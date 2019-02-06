package io.iamkyu.composite.after.domain;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerDevice {
    private List<ComputerDevice> componenets = new ArrayList<>();

    public void addComponent(ComputerDevice component) {
        componenets.add(component);
    }

    public void removeComponent(ComputerDevice component) {
        componenets.remove(component);
    }


    @Override
    public int getPrice() {
        return componenets.stream()
                .mapToInt(ComputerDevice::getPrice)
                .sum();
    }

    @Override
    public int getPower() {
        return componenets.stream()
                .mapToInt(ComputerDevice::getPower)
                .sum();
    }
}
