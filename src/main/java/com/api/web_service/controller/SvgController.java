package com.api.web_service.controller;

import com.api.web_service.entity.Greeting;
import com.api.web_service.model.SvgResponseModel;
import com.api.web_service.service.SVGServiceImpl;
import org.apache.commons.io.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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