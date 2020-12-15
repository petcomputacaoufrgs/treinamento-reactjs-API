package com.api.web_service.service;

import com.api.web_service.enumerable.SvgEnum;
import com.api.web_service.model.SvgRequestListModel;
import com.api.web_service.model.SvgRequestQuantityModel;
import com.api.web_service.model.SvgResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SVGServiceImpl {

    public static ResponseEntity<SvgResponseModel> getSVG() {
        return new ResponseEntity<>(convertEnumerableToModel(SvgEnum.ORCA), HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGs(SvgRequestListModel model) {
        ArrayList<SvgResponseModel> response = new ArrayList<>();
        ArrayList<Integer> idsList = model.getIds();

        Arrays.stream(SvgEnum.values()).forEach(enumerable -> {
            Integer enumId = enumerable.getId();
            if(idsList.contains(enumId)) {
                response.add(convertEnumerableToModel(enumerable));
            }
        });

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGs(SvgRequestQuantityModel model) {
        List<SvgResponseModel> response = Arrays.stream(SvgEnum.values()).map(SVGServiceImpl::convertEnumerableToModel).collect(Collectors.toList());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static ResponseEntity<List<SvgResponseModel>> getSVGAll() {
        List<SvgResponseModel> response = Arrays.stream(SvgEnum.values()).map(SVGServiceImpl::convertEnumerableToModel).collect(Collectors.toList());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private static SvgResponseModel convertEnumerableToModel(SvgEnum enumerable) {
        return new SvgResponseModel(enumerable.getId(), enumerable.getName(), enumerable.getValue());
    }
}
