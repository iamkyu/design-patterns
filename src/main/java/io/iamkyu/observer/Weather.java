package io.iamkyu.observer;

public class Weather {
    private final float temperature;
    private final float humidity;
    private final float pressure;

    public Weather(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
