package com.worker.workhandler.utils;

import com.worker.workhandler.Main;

import java.net.URL;

public class ResourceLoader {
    public static URL loadResourceFrom(Class<?> classTo, String resourceName){
        return classTo.getResource(resourceName);
    }

    public static URL loadResourceFromMain(String resourceName) {
        return loadResourceFrom(Main.class, resourceName);
    }
}
