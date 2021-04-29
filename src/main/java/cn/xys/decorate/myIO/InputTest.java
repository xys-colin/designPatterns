package cn.xys.decorate.myIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: muLin
 * @time: 2021/4/29 11:36
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream=new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/test.txt")));
            while ((c=inputStream.read())>=0){
                System.out.print((char) c);
            }
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
