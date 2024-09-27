package com.gabay.workflow.service.impl;

import com.gabay.workflow.req.ReModelReq;
import com.gabay.workflow.service.ReModelService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Model;
import org.activiti.engine.repository.ModelQuery;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReModelServiceImpl implements ReModelService {

    @Autowired
    RepositoryService repositoryService;

    @Override
    public String saveModel(ReModelReq req) {
        Model model;
        if (null != req.getModelId()) {
            model = repositoryService.getModel(req.getModelId());
            model.setVersion(model.getVersion() + 1);
        } else {
            model = repositoryService.newModel();
        }
        BeanUtils.copyProperties(req, model);
        repositoryService.saveModel(model);
        return model.getId();
    }

    @Override
    public Model findModelById(String id) {
        return repositoryService.getModel(id);
    }

    @Override
    public List<Model> findAllModel() {
        ModelQuery query =  repositoryService.createModelQuery();
        return query.list();
    }

}
