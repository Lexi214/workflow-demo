package com.gabay.workflow.server.service;

import com.gabay.workflow.server.req.ReModelReq;
import org.activiti.engine.repository.Model;

import java.util.List;

public interface ReModelService {

    String saveModel(ReModelReq req);

    Model findModelById(String id);

    List<Model> findAllModel();

}
