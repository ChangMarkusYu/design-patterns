package WeatherStation;

public class StatisticsDisplay implements Observer, DisplayElement{

    private Subject weatherData;
    private double minTemp;
    private double maxTemp;
    private double minHumidity;
    private double maxHumidity;
    private double minPressure;
    private double maxPressure;

    public StatisticsDisplay(Subject weatherData, double temp, double humidity, double pressure) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        this.minTemp = this.maxTemp = temp;
        this.minHumidity = this.maxHumidity = humidity;
        this.minPressure = this.maxPressure = pressure;
    }

    @Override
    public void update(double temp, double humidity, double pressure) {
        if(temp > maxTemp) {
            maxTemp = temp;
        }
        else if(temp < minTemp) {
            minTemp = temp;
        }

        if(humidity > maxHumidity) {
            maxHumidity = humidity;
        }
        else if(humidity < minHumidity) {
            minHumidity = humidity;
        }

        if(pressure > maxPressure) {
            maxPressure = pressure;
        }
        else if(pressure < minPressure) {
            minPressure = pressure;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("\nIn class \"StatisticsDisplay\": ");
        System.out.println("Max temperature: " + maxTemp + "C.");
        System.out.println("Min temperature: " + minTemp + "C.\n");

        System.out.println("Max humidity: " + maxHumidity + "%.");
        System.out.println("Min humidity: " + minHumidity + "%.\n");

        System.out.println("Max pressure: " + maxPressure + "psi.");
        System.out.println("Min pressure: " + minPressure + "psi.");
    }
}
