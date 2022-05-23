package services.message;

import services.fileService.JsonParser;

public class InputMessageService implements MessageService {

    JsonParser service = new JsonParser();

    @Override
    public void print(String text){
        System.out.println(text);
    }

    @Override
    public void showFighters(){
        System.out.println(service.getFighters("Fighter.json"));
    }

    @Override
    public void showDevices(){
        System.out.println(service.getDevices("items.json"));
    }

}
