package com.examples.self.learning.design.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader(new RealVideoDownloader());
        videoDownloader.getVideo("test");
        videoDownloader.getVideo("test");
        videoDownloader.getVideo("car");
    }
}
