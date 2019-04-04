/*
	Observer provides the blueprint of all "Observer" (i.e. the "Subscriber") in Observer Pattern.
*/
public interface Observer {
    
    /*
		The observer will update its state regarding three values: temperature, wind power, and humidity.
    */
    void update(double temperatureGrade, double windPowerGrade, double humidityGrade);

}