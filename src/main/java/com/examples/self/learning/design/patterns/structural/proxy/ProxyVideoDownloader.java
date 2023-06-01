package com.examples.self.learning.design.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader{
    private Map<String,Video> myCache = new HashMap<>();
    private RealVideoDownloader realVideoDownloader;
    public ProxyVideoDownloader(RealVideoDownloader videoDownloader){
        this.realVideoDownloader = videoDownloader;
    }
    @Override
    public Video getVideo(String name) {
        if(!myCache.containsKey(name)){
            myCache.put(name, realVideoDownloader.getVideo(name));
        }
        return myCache.get(name);
    }
}
