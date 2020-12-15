package com.api.web_service.model;

import com.api.web_service.enumerable.SvgEnum;

public class SvgResponseModel {
    private final Integer id;
    private final String name;
    private final String value;

    public SvgResponseModel(SvgEnum enumerable) {
        this.id = enumerable.getId();
        this.name = enumerable.toString();
        this.value = enumerable.getValue();
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getName() { return name; }
}
