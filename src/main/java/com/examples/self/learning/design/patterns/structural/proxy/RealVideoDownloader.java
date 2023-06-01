package com.examples.self.learning.design.patterns.structural.proxy;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public Video getVideo(String name) {
        System.out.println("Connecting to Youtube...");
        System.out.println("Downloading the vídeo ... " + name);
        return new Video(name);
    }
}
