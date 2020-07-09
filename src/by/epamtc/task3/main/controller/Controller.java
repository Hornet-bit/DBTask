package by.epamtc.task3.main.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    public static String[] stringParser(String str, int countOfParams) {

        String[] arrayOfParams = new String[countOfParams];


        String pattern = "(\\=[a-zA-Z0-9]+(\\.)?(-)?([a-zA-Z0-9]+)?(-)?([a-zA-Z0-9]+)?)";

        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(str);

        for (int i = 0; matcher.find(); i++) {

            arrayOfParams[i] = (str.substring(matcher.start() + 1, matcher.end()));

        }

        return arrayOfParams;
    }


    public static int countOfParams(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '=') {
                count++;
            }
        }

        return count;
    }


}
