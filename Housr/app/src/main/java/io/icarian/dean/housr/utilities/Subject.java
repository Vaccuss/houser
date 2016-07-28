package io.icarian.dean.housr.utilities;

//import java.util.Observer;

/**
 * Created by Dean on 25-Jul-16.
 *
 */
public interface Subject {

    //methods to register and unregister observers
    public int getState();
    public void setState(int state);

    //method to notify observers of change
    public void attach(Observer observer);

    //method to get updates from subject
    public void notifyAllObservers();

}
