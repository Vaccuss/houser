package io.icarian.dean.housr.utilities;

/**
 * Created by Dean on 25-Jul-16.
 *
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}