package services.message;

import java.io.IOException;
import java.util.Scanner;

public class InputMessageService implements MessageService {

    @Override
    public void print(String text){
        System.out.println(text);
    }

//    @Override
//    public int enterNumber() throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        int i = -1;
//        if (scanner.hasNextInt()){
//            i = scanner.nextInt() -1;
//        }
//        else{
//            throw new IOException("Вы ввели не число, попробуйте снова!");
//        }
//        return i;
//    }
}
