import java.util.Set;
import java.util.HashSet;
import java.util.NoSuchElementException;


class AlarmSubject implements Subject {

    Set<Observer> observers;
    double temperatureGrade;
    double windPowerGrade;
    double humidityGrade;


    public AlarmSubject(double temperatureGrade, double windPowerGrade, double humidityGrade) {
        observers = new HashSet<>();
        this.temperatureGrade = temperatureGrade;
        this.windPowerGrade = windPowerGrade;
        this.humidityGrade = humidityGrade;
    }

    public void setTemperatureGrade(double temperatureGrade) {
        this.temperatureGrade = temperatureGrade;
        notifyAllObservers();
    }

    public void setWindPowerGrade(double windPowerGrade) {
        this.windPowerGrade = windPowerGrade;
        notifyAllObservers();
    }

    public void setHumidityGrade(double humidityGrade) {
        this.humidityGrade = humidityGrade;
        notifyAllObservers();
    }


    @Override
    public void register(Observer newObserver) {
        if (!observers.contains(newObserver)) {
            observers.add(newObserver);
        }
    }

    @Override
    public void unregister(Observer toBeDeleted) {
        if (!observers.contains(toBeDeleted)) {
            throw new NoSuchElementException("[Subject] No such observer to be deleted: " + toBeDeleted);
        }
        observers.remove(toBeDeleted);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(temperatureGrade, windPowerGrade, humidityGrade);
        }
    }

    @Override
    public String toString() {
        return "AlarmSubject{" +
                "temperatureGrade=" + temperatureGrade +
                ", windPowerGrade=" + windPowerGrade +
                ", humidityGrade=" + humidityGrade +
                '}';
    }
}