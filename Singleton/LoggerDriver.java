/*
    TemperatureObserver is a "Observer" (the "Subscriber") in Observer Pattern.

    It provides methods to update its own state, for example, a temperatureGrade value.
*/
public class TemperatureObserver implements Observer {
    
    private static int observerIdTracker = 0;

    private int observerId;
    private Subject alarmSubject;
    private double temperatureGrade;

    
    public TemperatureObserver(Subject alarmSubject) {
        this.alarmSubject = alarmSubject;
        observerId = ++observerIdTracker;

        alarmSubject.register(this);
    }


    /*
        It receives whole information about each update and subtract only necessary info that matters to itself, for example, a temperatureGrade value.
    */
    @Override
    public void update(double temperatureGrade, double windPowerGrade, double humidityGrade) {
        this.temperatureGrade = temperatureGrade;
    }

    public void unregister(){
        alarmSubject.unregister(this);
    }
}