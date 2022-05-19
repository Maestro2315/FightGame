package services.message;

import java.io.IOException;
import java.util.Scanner;

public class InputMessageService implements MessageService {

    @Override
    public void print(String text){
        System.out.println(text);
    }

}
