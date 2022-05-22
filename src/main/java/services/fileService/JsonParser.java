package services.fileService;

import modules.Devices;
import modules.Fighter;

import java.util.List;

public interface JsonParser {

    List<Fighter> getFighters(String string);

    List<Devices> getDevices(String string);
}
