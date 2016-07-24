package io.icarian.dean.housr.utils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Dean on 24-Jul-16.
 * Single point for storing data in the application that can be accessed
 * across all activities.
 */
public class DataOrganiser {
    private static DataOrganiser mInstance;

    public ArrayList<HouseModel> allHouses;


    protected DataOrganiser() {
        // Exists only to defeat instantiation.
    }

    public static synchronized DataOrganiser getInstance() {
        if (mInstance == null) {
            mInstance = new DataOrganiser();
        }
        return mInstance;
    }


    /**
     * @param jsonArray
     * @throws JSONException
     */
    private void buildHouseArray(JSONArray jsonArray) throws JSONException {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            HouseModel model = new HouseModel(jsonObject);
            allHouses.add(model);
        }
    }


}

