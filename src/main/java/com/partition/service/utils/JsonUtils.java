package com.partition.service.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtils {

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

    public static <T> Object jsonToJavaObject(String json, Class<T> targetClass) {
        Gson gson = new GsonBuilder()   .setDateFormat(DATE_FORMAT).create();
        return gson.fromJson(json, targetClass);
    }
}
