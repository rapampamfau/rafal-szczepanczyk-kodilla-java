package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double temperaturesSum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesSum += temperature.getValue();
        }
        double average = (temperaturesSum / temperatures.getTemperatures().size());
        return average;
    }

    public double calculateMedianTemperature() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue());
        }
        List<Double> temperatureValues = new ArrayList<>(resultMap.values());

        Collections.sort(temperatureValues);

        double median;
        if (temperatureValues.size() % 2 == 0) {
            median = ((double) temperatureValues.get(temperatureValues.size() / 2) +
                    (double) temperatureValues.get(temperatureValues.size() / 2 - 1)) / 2;
        } else {
            median = (double) temperatureValues.get(temperatureValues.size() / 2);
        }
        return median;
    }
}