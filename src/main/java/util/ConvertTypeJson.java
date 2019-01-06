package util;

import com.google.gson.Gson;
import java.lang.reflect.Type;

public class ConvertTypeJson {


    /* This method converts a Java Object in a JSON */
    public static <T> String convertObjectToStringJson(T someObject, Type type) {
        Gson gson = new Gson();
        String strJson = gson.toJson(someObject, type);
        return strJson;
    }

    /* This method converts a JSON in a Java Object*/
    public static <T> T getObjectFromJson(String json, Type type) {
        Gson gson = new Gson();
        if (json != null){
            return gson.fromJson(json, type);
        }else{
            return null;
        }
    }
}
