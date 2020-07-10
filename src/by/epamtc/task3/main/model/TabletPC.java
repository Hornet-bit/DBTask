package by.epamtc.task3.main.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(baterryCapacity, tabletPC.baterryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baterryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
