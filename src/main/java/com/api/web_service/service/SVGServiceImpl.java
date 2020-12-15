package com.api.web_service.service;

import com.api.web_service.enumerable.SvgEnum;
import com.api.web_service.model.SvgRequestListModel;
import com.api.web_service.model.SvgRequestQuantityModel;
import com.api.web_service.model.SvgResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SVGServiceImpl {

    public static ResponseEntity<SvgResponseModel> getSVG() {
        return new ResponseEntity<>(new SvgResponseModel(SvgEnum.ORCA), HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGs(SvgRequestListModel model) {
        ArrayList<SvgResponseModel> response = new ArrayList<>();
        ArrayList<Integer> idsList = model.getIds();

        for (SvgEnum enumerable : SvgEnum.values()) {
            if(idsList.contains(enumerable.getId())) {
                response.add(new SvgResponseModel(enumerable));
            }
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGs(SvgRequestQuantityModel model) {

        ArrayList<SvgResponseModel> response = new ArrayList<>();

        SvgEnum[] enumerables =  SvgEnum.values();

        for (int i = 0; i < model.getQuantity(); i++) {
            response.add(new SvgResponseModel(enumerables[i]));
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGAll() {
        ArrayList<SvgResponseModel> response = new ArrayList<>();

        for (SvgEnum enumerable : SvgEnum.values()) {
            response.add(new SvgResponseModel(enumerable));
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
