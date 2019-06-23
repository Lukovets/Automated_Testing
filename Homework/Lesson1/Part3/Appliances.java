<<<<<<< HEAD
public class Appliances {
                 private String brand; //internal attribute 
				 private String model; //internal attribute 
				 private String type; //internal attribute 
				 private String energy type; //internal attribute 
				 private String installation method; //internal attribute 
				 private boolean display; //internal attribute 
				 private int maximum load; //internal attribute 
				 private String operation mode;	//internal attribute 
				 private int volume; //internal attribute 
				 private int dimensions; //internal attribute 			 
public String getBrand () { return brand; } //the way to get information about brand
public String getModel () { return model; } //the way to get information about model  
public String getType () { return type; } //the way to get information about type
					}
	
public class Refrigerator extends Appliances {
				private String freezer; //internal attribute 
				private String freshness zone; //internal attribute 
				private String compressor; //internal attribute 
private makeIce() {} //the way to make ice
private keepFresh() {} //the way to keep fresh
											}	

public class WashingMachine extends Appliances {
				private String centrifuge; //internal attribute 
				private String engine; //internal attribute 
				private String wi-fi module; //internal attribute 
private delicateWash() {} //wash program selection
private reboot() {} //the way to restart the machine
											}	

	
public class AirCondition extends Appliances {
				private int area; //internal attribute 
				private String compressor; //internal attribute 
				private String wi-fi module; //internal attribute 
private coolTheAir() {} //program selection
private heatTheAir() {} //program selection
											}											
		
public class Boiler extends Appliances {
				private String form; //internal attribute 
				private String heating element; //internal attribute 
				private int power; //internal attribute 
private heaTheWater() {} //program selection
private keepTemperature() {} //program selection
											}	
											
//What is same for all there entities: parameters of brand, model, type, energy class, installation method, display, maximum load, operation mode, volume, dimensions//
//What is different for all there entities: brand, model, type, energy class, installation method, display, maximum load, operation mode, volume, dimensions//
=======
public class Appliances {
                 private String brand; //internal attribute 
				 private String model; //internal attribute 
				 private String type; //internal attribute 
				 private String energy type; //internal attribute 
				 private String installation method; //internal attribute 
				 private boolean display; //internal attribute 
				 private int maximum load; //internal attribute 
				 private String operation mode;	//internal attribute 
				 private int volume; //internal attribute 
				 private int dimensions; //internal attribute 			 
public String getBrand () { return brand; } //the way to get information about brand
public String getModel () { return model; } //the way to get information about model  
public String getType () { return type; } //the way to get information about type
					}
	
public class Refrigerator extends Appliances {
				private String freezer; //internal attribute 
				private String freshness zone; //internal attribute 
				private String compressor; //internal attribute 
private makeIce() {} //the way to make ice
private keepFresh() {} //the way to keep fresh
											}	

public class WashingMachine extends Appliances {
				private String centrifuge; //internal attribute 
				private String engine; //internal attribute 
				private String wi-fi module; //internal attribute 
private delicateWash() {} //wash program selection
private reboot() {} //the way to restart the machine
											}	

	
public class AirCondition extends Appliances {
				private int area; //internal attribute 
				private String compressor; //internal attribute 
				private String wi-fi module; //internal attribute 
private coolTheAir() {} //program selection
private heatTheAir() {} //program selection
											}											
		
public class Boiler extends Appliances {
				private String form; //internal attribute 
				private String heating element; //internal attribute 
				private int power; //internal attribute 
private heaTheWater() {} //program selection
private keepTemperature() {} //program selection
											}	
											
//What is same for all there entities: parameters of brand, model, type, energy class, installation method, display, maximum load, operation mode, volume, dimensions//
//What is different for all there entities: brand, model, type, energy class, installation method, display, maximum load, operation mode, volume, dimensions//
>>>>>>> e2f678ae8e33ced5aff4fb3c7cc2943f24b24a56
