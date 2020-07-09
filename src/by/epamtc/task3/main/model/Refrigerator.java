package by.epamtc.task3.main.model;

public class Refrigerator {

    String powerConsumption;
    String weight;
    String freezerCapacity;
    String overallCapacity;
    String height;
    String width;

    public Refrigerator(String powerConsumption, String weight, String freezerCapacity, String overallCapacity, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", freezerCapacity='" + freezerCapacity + '\'' +
                ", overallCapacity='" + overallCapacity + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
