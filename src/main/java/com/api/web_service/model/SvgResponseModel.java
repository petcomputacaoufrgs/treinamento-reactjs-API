package com.api.web_service.model;

public class SvgResponseModel {
    private final Integer id;
    private final String value;
    private final String name;

    public SvgResponseModel(int id, String name, String value) {
        this.id = id;
        this.value = value;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getNameI() {return name;}
}
