package com.gabay.workflow.controller;

import com.gabay.workflow.req.ReModelReq;
import com.gabay.workflow.service.ReModelService;
import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.repository.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    ReModelService reModelService;

    @PostMapping("/save")
    @ResponseBody
    public String saveModel(@RequestBody ReModelReq req) {
        return reModelService.saveModel(req);
    }

    @RequestMapping("/find")
    @ResponseBody
    public Model findModel(String modelId) {
        return reModelService.findModelById(modelId);
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Model> listModel() {
        return reModelService.findAllModel();
    }

}
