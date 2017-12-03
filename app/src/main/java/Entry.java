
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;


public class Entry {
    String data,time;
    int cost,cashierId;


    public Entry(String data, String time, int cost, int cashierId) {

        this.data = data;
        this.time = time;
        this.cost = cost;
        this.cashierId = cashierId;

    }

    public String getData() {
        return data;
    }
    public String getTime() {
        return time;
    }
    public int getCost() {
        return cost;
    }
    public int getCashierId() {
        return cashierId;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setCashierId(int cashierId) {
        this.cashierId = cashierId;
    }

    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection, unchecked")
    public String toJSON(){

        JSONObject jsonObject= new JSONObject();
        jsonObject.put("data", data);
        jsonObject.put("time", time);
        jsonObject.put("cost", cost);
        jsonObject.put("cashierId", cashierId);

        return jsonObject.toJSONString();
    }

    public void fromJSON(JSONObject jsonObject) {

        this.data = (String) jsonObject.get("data");
        this.time = (String) jsonObject.get("time");
        this.cost = (int) jsonObject.get("cost");
        this.cashierId = (int) jsonObject.get("cashierId");

    }

}
