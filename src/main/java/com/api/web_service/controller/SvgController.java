package com.api.web_service.controller;

import com.api.web_service.model.SvgResponseModel;
import com.api.web_service.service.SVGServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SvgController {

    @GetMapping("/svg")
    public ResponseEntity<SvgResponseModel> getSVG() {
        return SVGServiceImpl.getSVG();
    }

    @GetMapping("/svg/all")
    public ResponseEntity<ArrayList<SvgResponseModel>> getSVGAll() {
        return SVGServiceImpl.getSVGAll();
    }
}