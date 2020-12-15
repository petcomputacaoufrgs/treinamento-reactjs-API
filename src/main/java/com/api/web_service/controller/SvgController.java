package com.api.web_service.controller;

import com.api.web_service.enumerable.SvgEnum;
import com.api.web_service.model.SvgRequestListModel;
import com.api.web_service.model.SvgRequestQuantityModel;
import com.api.web_service.model.SvgResponseModel;
import com.api.web_service.service.SVGServiceImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class SvgController {

    @GetMapping("/svg")
    public ResponseEntity<SvgResponseModel> getSVG() {
        return SVGServiceImpl.getSVG();
    }

    @GetMapping("/svg/all")
    public ResponseEntity<List<SvgResponseModel>> getSVGAll() {
        return SVGServiceImpl.getSVGAll();
    }

    @PostMapping("/svg/list")
    public ResponseEntity<List<SvgResponseModel>> getSVGs(@RequestBody SvgRequestListModel model) {
        return SVGServiceImpl.getSVGs(model);
    }

    @PostMapping("/svg/quantity")
    public ResponseEntity<List<SvgResponseModel>> getSVGs(@RequestBody SvgRequestQuantityModel model) {
        return SVGServiceImpl.getSVGs(model);
    }

    @GetMapping("/svg/string")
    public static ResponseEntity<String> getSVGAsString() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf("image/enumerable+xml"));
        return new ResponseEntity<>(SvgEnum.OWL.getValue(), headers, HttpStatus.OK);
    }
}