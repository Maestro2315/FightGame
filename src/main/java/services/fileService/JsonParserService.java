package services.fileService;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import modules.Devices;
import modules.Fighter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonParserService implements JsonParser {

    @Override
    public List<Fighter> getFighters(String string) {
        Type fighterList = new TypeToken<ArrayList<Fighter>>() {
        }.getType();
        return new Gson().fromJson(string, fighterList);
    }

    @Override
    public List<Devices> getDevices(String string) {
        Type deviceList = new TypeToken<ArrayList<Devices>>() {
        }.getType();
        return new Gson().fromJson(string, deviceList);
    }
}
