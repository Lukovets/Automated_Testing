public class Appliances {
    private String brand;
    private String model;
    private String energyType;
    private String installationMethod;
    private String operationMode;
    private boolean display;
    private int maximumLoad;
    private int volume;
    private int dimensions;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEnergyType() {
        return energyType;
    }

    public void setEnergyType(String energyType) {
        this.energyType = energyType;
    }

    public String getInstallationMethod() {
        return installationMethod;
    }

    public void setInstallationMethod(String installationMethod) {
        this.installationMethod = installationMethod;
    }

    public String getOperationMode() {
        return operationMode;
    }

    public void setOperationMode(String operationMode) {
        this.operationMode = operationMode;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getMaximumLoad() {
        return maximumLoad;
    }

    public void setMaximumLoad(int maximumLoad) {
        this.maximumLoad = maximumLoad;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
