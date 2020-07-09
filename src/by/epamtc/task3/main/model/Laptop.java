package by.epamtc.task3.main.model;

public class Laptop {
    String baterryCapacity;
    String os;
    String memoryRom;
    String systemMemory;
    String cpu;
    String displayInchs;

    public Laptop(String baterryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.baterryCapacity = baterryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "baterryCapacity='" + baterryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }
}
