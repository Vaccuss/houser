package io.icarian.dean.housr.dataModels;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import io.icarian.dean.housr.interfaces.Observer;
import io.icarian.dean.housr.interfaces.Subject;

/**
 * Created by Dean on 24-Jul-16.
 * Single point for storing data in the application that can be accessed
 * across all activities.
 */
public class houseSubject implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;


    private static houseSubject mInstance;
//    private List<Observer> observers;
//    private String message;
//    private boolean changed;
//    private final Object MUTEX= new Object();

    public ArrayList<HouseModel> allHouses;


    protected houseSubject() {
        // Exists only to defeat instantiation.
    }

    public static synchronized houseSubject getInstance() {
        if (mInstance == null) {
            mInstance = new houseSubject();
        }
        return mInstance;
    }

    //TODO: create and return request to web api


    /**
     * @param jsonArray Array of data retrieved from server
     * @throws JSONException
     */
    private void buildHouseArray(JSONArray jsonArray) throws JSONException {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            HouseModel model = new HouseModel(jsonObject);
            allHouses.add(model);
        }
    }
    @Override
    public int getState() {
        return state;
    }
    @Override
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    @Override
    public void attach(Observer observer){
        observers.add(observer);
    }
    @Override
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

