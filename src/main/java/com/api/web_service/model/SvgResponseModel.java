package com.api.web_service.model;

public class SvgResponseModel {

    private final int id;
    private final String value;

    public SvgResponseModel(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
