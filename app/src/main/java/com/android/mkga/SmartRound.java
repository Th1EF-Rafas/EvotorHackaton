package com.android.mkga;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by evgeniy.nikolaev on 03.12.2017.
 */

public class SmartRound {
    public static void main(String[] args) {
        float check=5.67f;
        SmartRound rounder=new SmartRound();
        System.out.println(rounder.round(check));
        System.out.println("Shout out to Misha");


    }

    private Stack<Number> actions;

    public SmartRound(){
        actions=new Stack<>();
    }


    public Number round(Number number) {
        actions.push(number);
        int result = 0;
        float temp = number.intValue();
        int i = 0;
        do {
            float change = number.floatValue() - temp;
            if (change > 1e-3 && change < 1 && i == 0) {
                int k= (int)(temp +1.0);
                int p=9;
                return k;
            }
            if (change > 1 && change < 5) {

            }
            if (change > 4) {
                result = (int)(temp / 10 + 1) * 10;
            }
            temp = temp / 10 - temp % 10;

        } while (temp > 1e-3);
        return result;
    }




    public Number revertLastAction(){
        return actions.pop();
    }
}
