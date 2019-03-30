
public class AlarmObserver implements Observer {
    private static int observerIdTracker = 0;

    private int observerId;

    private Subject alarmSubject;
    private double temperatureGrade;
    private double windPowerGrade;
    private double humidityGrade;


    @Override
    public void update(double temperatureGrade, double windPowerGrade, double humidityGrade) {
        this.temperatureGrade = temperatureGrade;
        this.windPowerGrade = windPowerGrade;
        this.humidityGrade = humidityGrade;
    }

    public AlarmObserver(Subject alarmSubject) {
        this.alarmSubject = alarmSubject;
        observerId = ++observerIdTracker;

        alarmSubject.register(this);
    }
}