package by.epamtc.task3.main.model;

public class TabletPC {
    String baterryCapacity;
    String displayInches;
    String memoryRom;
    String flashMemoryCapacity;
    String color;

    public TabletPC(String baterryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        this.baterryCapacity = baterryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "baterryCapacity='" + baterryCapacity + '\'' +
                ", displayInches='" + displayInches + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
