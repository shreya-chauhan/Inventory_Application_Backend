package com.new_project.Inventory.Inventory;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

@Component
public class InventoryService {

//    public JSONArray getInventoryList(){
//
//        JSONParser jsonParser = new JSONParser();
//
//        try {
//            FileReader reader = new FileReader("ouput.json");
//            Object object = jsonParser.parse(reader);
//            JSONArray InventoryList = (JSONArray) object;
//            return InventoryList;
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (ParseException e){
//            e.printStackTrace();
//        }
//        return [];
//    }

    public String createInventoryList(){
        JSONObject jsonObject = new JSONObject();

        List<InventoryVariables> list = Arrays.asList(new InventoryVariables(
                1L,
                "Product 1",
                1.09f,
                10L
        ));

        jsonObject.put("product_ID",list.get(0));
        jsonObject.put("productName",list.get(1));
        jsonObject.put("price",list.get(2));
        jsonObject.put("quality",list.get(3));


        try {
            FileWriter file = new FileWriter("../../../output.json");
            file.write(jsonObject.toJSONString());
            file.close();
            return "Success";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "fail";
    }
}
