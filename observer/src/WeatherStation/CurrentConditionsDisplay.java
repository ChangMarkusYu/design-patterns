package WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // store a reference to the subject in case we want to unsubscribe from it in the future.
    private Subject weatherData;
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("\nIn class \"CurrentConditionsDisplay\": ");
        System.out.println("temperature: " + temperature + "C.");
        System.out.println("humidity: " + humidity + "%.");
        System.out.println("pressure: " + pressure + "psi.");
    }
}
