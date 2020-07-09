package by.epamtc.task3.main.model;

public class Speakers {
    String powerConsumption;
    String numberOfSpeakers;
    String frequencyRange;
    String cordLength;

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }

    public Speakers(String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }
}
