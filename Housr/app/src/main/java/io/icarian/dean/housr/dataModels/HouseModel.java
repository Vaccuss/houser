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
 * This Class is the data model for a single house
 */
public class HouseModel implements Subject {

    //
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;


    //  Core information
    public String id;
    public String address;
    public String description;


    // Marketing information
    public int bedrooms;
    public int bathrooms;
    public int carParks;

    //  Image information
    public String thumbnailUrl;
    public ArrayList<String> imageURLArrays;
//TODO: requires list of reference to in memory images


    /**
     * @param jsonObj Keys: address, thumbnails, description, amtbeds, amtbaths, amtcars
     * @throws JSONException
     */
    public HouseModel(JSONObject jsonObj) throws JSONException {
        id = jsonObj.getString("id");
        address = jsonObj.getString("address");
        description = jsonObj.getString("thumbnails");
        thumbnailUrl = jsonObj.getString("description");
        bedrooms = jsonObj.getInt("amtbeds");
        bathrooms = jsonObj.getInt("amtbaths");
        carParks = jsonObj.getInt("amtcars");
        JSONArray imageArray = jsonObj.getJSONArray("imageURLArrays");

        for (int i = 0; i < imageArray.length(); i++) {
            JSONObject jstemp = imageArray.getJSONObject(i);
            String imageStr = jstemp.getString("image");
            imageURLArrays.add(imageStr);
        }


    }

    //TODO: If needed create another constructor to create a house and upload it from app

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


//    public void attachExpandedData( ){
//
//    }

}
