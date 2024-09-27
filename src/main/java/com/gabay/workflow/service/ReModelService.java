package com.gabay.workflow.service;

import com.gabay.workflow.req.ReModelReq;
import org.activiti.engine.repository.Model;

import java.util.List;

public interface ReModelService {

    String saveModel(ReModelReq req);

    Model findModelById(String id);

    List<Model> findAllModel();

}
