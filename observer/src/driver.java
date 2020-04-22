import WeatherStation.CurrentConditionsDisplay;
import WeatherStation.StatisticsDisplay;
import WeatherStation.WeatherData;

public class driver {
    public static void main(String[] args) {
        // the concrete subject
        WeatherData weatherData = new WeatherData();
        // the concrete observer
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData, 10,85,0.2);

        weatherData.setMeasurements(27,95,0.5);
        weatherData.setMeasurements(30,99,1);

        // unsubscribe an observer
        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(50, 100,20);
    }
}
