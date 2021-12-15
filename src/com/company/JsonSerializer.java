package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonSerializer {
    public static Map<String,Human> getHumans() throws IOException {
        Gson gson = new Gson();
        try(Reader reader = new FileReader("Humans.json")){
            List<Human> humans = gson.fromJson(reader, new TypeToken<List<Human>>(){}.getType());
            Map<String,Human> humanMap = new HashMap<>();
            for(int i = 0; i < humans.size(); i++){
                humanMap.put(humans.get(i).getName(),humans.get(i));
            }
            return humanMap;
        }
    }
}
