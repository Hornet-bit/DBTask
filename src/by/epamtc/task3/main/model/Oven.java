package by.epamtc.task3.main.model;

public class Oven {
    String powerConsumption;
    String weight;
    String capacity;
    String depth;
    String height;
    String width;

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

    public Oven(String powerConsumption, String weight, String capacity, String depth, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
}
