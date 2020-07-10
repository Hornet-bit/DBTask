package by.epamtc.task3.main.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(baterryCapacity, laptop.baterryCapacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memoryRom, laptop.memoryRom) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(displayInchs, laptop.displayInchs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baterryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }
}
