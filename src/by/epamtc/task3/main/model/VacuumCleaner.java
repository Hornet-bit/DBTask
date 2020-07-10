package by.epamtc.task3.main.model;

import java.util.Objects;

public class VacuumCleaner {
    String powerConsumption;
    String filterType;
    String bgType;
    String wandType;
    String motorSpeedRegulation;
    String cleaningWidth;

    public VacuumCleaner(String powerConsumption, String filterType, String bgType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bgType = bgType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bgType='" + bgType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bgType, that.bgType) &&
                Objects.equals(wandType, that.wandType) &&
                Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) &&
                Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bgType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
