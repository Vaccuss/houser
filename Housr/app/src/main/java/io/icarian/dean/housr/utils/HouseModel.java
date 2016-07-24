package io.icarian.dean.housr.utils;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Dean on 24-Jul-16.
 * This Class is the data model for a single house
 */
public class HouseModel {
    public String address;
    public String description;
    public String thumbnailUrl;

    public int bedrooms;
    public int bathrooms;
    public int carParks;


    private ArrayList<String> ImageURLList;

    /**
     * @param jsonObj Keys: address, thumbnails, description, amtbeds, amtbaths, amtcars
     * @throws JSONException
     */
    public HouseModel(JSONObject jsonObj) throws JSONException {
        this.address = jsonObj.getString("address");
        description = jsonObj.getString("thumbnails");
        thumbnailUrl = jsonObj.getString("description");
        bedrooms = jsonObj.getInt("amtbeds");
        bathrooms = jsonObj.getInt("amtbaths");
        carParks = jsonObj.getInt("amtcars");
    }

//    public void attachExpandedData( ){
//
//    }

}
