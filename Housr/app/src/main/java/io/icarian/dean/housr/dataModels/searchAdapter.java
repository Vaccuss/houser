package io.icarian.dean.housr.dataModels;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import org.json.JSONArray;



import java.util.ArrayList;

/**
 * Created by Dean on 23-Jul-16.
 *
 */
public class searchAdapter extends ArrayAdapter<JSONArray> {

    ArrayList<JSONArray> badges;
// Adapter INIT function requires content, xml "Item", Data Stuff
    searchAdapter(Context context, int resource, ArrayList<JSONArray> objects) {
        super(context, resource, objects);
        badges = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

//        if (v == null) {
//            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            v = inflater.inflate(R.layout.activity_badge_listitem, null);
//        }

//        hearderText.set(JSONObject["header"]


//        Badge currentBadge = badges.get(position);
//        if (!currentBadge.achieved)
//            currentBadge = Settings.lockedBadge;
//
//        if (currentBadge != null) {
//            BadgeView badgeImage = (BadgeView) v.findViewById(R.id.badgeimage);
//            TextView badgeText = (TextView) v.findViewById(R.id.badgedescription);
//
//            badgeImage.setBadge(currentBadge);
//            badgeImage.setManager();
//            badgeImage.setMinimumHeight(badgeImage.getWidth());
//
//            badgeText.setText(currentBadge.getDescription());
//        }
        return v;

    }
}
