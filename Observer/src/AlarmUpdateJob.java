public class AlarmUpdateJob implements Runnable {

    private Subject alarmSubject;

    public AlarmUpdateJob(Subject alarmSubject, String fieldType, double newValue){
        this.alarmSubject = alarmSubject;
        
    }
}
