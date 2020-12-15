package com.api.web_service.model;

import java.util.ArrayList;

public class SvgRequestListModel {

    private ArrayList<Integer> ids;

    public SvgRequestListModel() {}

    public SvgRequestListModel(ArrayList<Integer> ids) {
        this.ids = ids;
    }

    public ArrayList<Integer> getIds() {
        return ids;
    }
}
