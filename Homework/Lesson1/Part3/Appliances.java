public class Appliances {
                 private String brand;
				 private String model;
				 private String type;
				 private String energyType;
				 private String installationMethod;
				 private boolean display;
				 private int maximumLoad;
				 private String operationMode;
				 private int volume;
				 private int dimensions;
public String getBrand () { return brand; }
public String getModel () { return model; }
public String getType () { return type; }
					}
	
public class Refrigerator extends Appliances {
				private String freezer;
				private String freshnessZone;
				private String compressor;
private makeIce() {}
private keepFresh() {}
}

public class WashingMachine extends Appliances {
				private String centrifuge;
				private String engine;
				private String wiFiModule;
private delicateWash() {}
private reboot() {}
}

public class AirCondition extends Appliances {
				private int area;
				private String compressor;
				private String wiFiModule;
private coolTheAir() {}
private heatTheAir() {}
}
		
public class Boiler extends Appliances {
				private String form;
				private String heatingElement;
				private int power;
private heaTheWater() {}
private keepTemperature() {}
}