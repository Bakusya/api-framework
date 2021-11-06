package utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class ObjectConverter {

    private static ObjectMapper objectMapper = new ObjectMapper();

    //Converting json object to string into the java object
    public static <T> T convertJsonObjectToJavaObject(String jsonObject, Class<T> clazz) throws JsonProcessingException{
        return objectMapper.readValue(jsonObject,clazz);

    }

    //converting json array string into the list of objects
    // @param jsonArray
    // @param clazz
    // @param <T>

    public static <T> List<T> convertJsonArrayToListOfObjects(String jsonArray, Class<T> clazz) throws JsonProcessingException{
        return Arrays.asList(objectMapper.readValue(jsonArray,clazz));
    }
}
