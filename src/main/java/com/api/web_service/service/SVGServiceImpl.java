package com.api.web_service.service;

import com.api.web_service.enumerable.SvgEnum;
import com.api.web_service.model.SvgRequestListModel;
import com.api.web_service.model.SvgRequestQuantityModel;
import com.api.web_service.model.SvgResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SVGServiceImpl {

    public static ResponseEntity<SvgResponseModel> getSVG() {
        return new ResponseEntity<>(new SvgResponseModel(SvgEnum.ORCA.getId(), SvgEnum.ORCA.getValue()), HttpStatus.OK);
    }

    public static ResponseEntity<ArrayList<SvgResponseModel>> getSVGs(SvgRequestListModel model) {

        ArrayList<SvgResponseModel> response = new ArrayList<>();
        ArrayList<Integer> idsList = model.getIds();

        for (SvgEnum enumerable : SvgEnum.values() ) {
            int enumId = enumerable.getId();
            if(idsList.contains(enumId)) {
                response.add(new SvgResponseModel(enumId, enumerable.getValue()));
            }
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<ArrayList<SvgResponseModel>> getSVGs(SvgRequestQuantityModel model) {

        ArrayList<SvgResponseModel> response = new ArrayList<>();

        SvgEnum[] enumerables =  SvgEnum.values();

        for (int i = 0; i < model.getQuantity(); i++) {
            response.add(new SvgResponseModel(enumerables[i].getId(), enumerables[i].getValue()));
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<ArrayList<SvgResponseModel>> getSVGAll() {

        ArrayList<SvgResponseModel> response = new ArrayList<>();

        for (SvgEnum enumerable : SvgEnum.values() ) {
            response.add(new SvgResponseModel(enumerable.getId(), enumerable.getValue()));
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
