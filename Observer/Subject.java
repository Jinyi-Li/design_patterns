/*
	Subject provides the blueprint of all "Subject" (i.e. the "Publisher") in Observer Pattern.
*/
public interface Subject {

	/*
		Register newObserver to this subject.

		The newObserver now receives all updates on this subject.
	*/
    void register(Observer newObserver);
    
    /*
		Remove toBeDeleted observer from this subject.

		The toBeDeleted observer will stop receiving updates from this subject.
    */
    void unregister(Observer toBeDeleted);
    
    /*
		Notify all observers under this subject.
    */
    void notifyAllObservers();

}
