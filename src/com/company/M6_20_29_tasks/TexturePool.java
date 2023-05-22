package com.company.M6_20_29_tasks;

public class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool() {
    }

    public static TexturePool getInstance() {
        return instance;
    }

    public String getTexture(String textureName) {
        return ("Get texture " + textureName);
    }
}
