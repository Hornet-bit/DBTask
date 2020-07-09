package by.epamtc.task3.main.model;

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
}
