package main.java.observe.subscribers;

import main.java.observe.publisher.implementations.WeatherData;
import main.java.observe.publisher.interfaces.DisplayElement;
import main.java.observe.publisher.interfaces.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    //private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {  //Subject weatherData
        this.observable = observable;
        observable.addObserver(this);
        /*this.weatherData = weatherData;
        weatherData.registerObserver(this);*/
    }

    @Override
    public void update(Observable obs, Object obj) {  //float temp, float humidity, float pressure
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
