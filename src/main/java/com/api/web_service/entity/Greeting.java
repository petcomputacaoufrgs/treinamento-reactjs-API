package com.api.web_service.entity;

import java.util.ArrayList;

public class Greeting {

    private final long id;
    private final String content;
    private byte[] img;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.img = new byte[0];
    }

    public Greeting(long id, String content, byte[] img) {
        this.id = id;
        this.content = content;
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public byte[] getImg() {
        return img;
    }
}