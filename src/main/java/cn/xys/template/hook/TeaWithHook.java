package cn.xys.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: muLin
 * @time: 2021/5/12 12:00
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    protected void brew() {
        System.out.println("Steeping the tea");
    }
    /**
     * 覆盖基类的钩子，提供自己的功能
     * @return boolean
     */
    @Override
    boolean customerWantsCondiments() {
        String answer=getUserInput();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else return false;
    }

    private String getUserInput() {
        String answer=null;
        System.out.println("Would you like lemon with your coffee (y/n)? ");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try {
            answer=in.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        if (answer==null)
            return "no";
        return answer;
    }
}
