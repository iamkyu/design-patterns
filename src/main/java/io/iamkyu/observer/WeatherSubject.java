package io.iamkyu.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Weather weather;

    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        int index = observers.indexOf(observer);
        if (index > -1) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(weather));
    }

    public void setMeasurements(Weather weather) {
        this.weather = weather;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }
}
