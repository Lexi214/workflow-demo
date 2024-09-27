package com.gabay.workflow.client.service.impl;

import com.gabay.workflow.client.entity.StaffInfo;
import com.gabay.workflow.client.mapper.StaffInfoMapper;
import com.gabay.workflow.client.service.StaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffInfoServiceImpl implements StaffInfoService {

    @Autowired
    StaffInfoMapper staffInfoMapper;

    @Override
    public StaffInfo getStaffInfoByStaffNo(String staffNo) {
        return staffInfoMapper.selectStaffInfoByStaffNo(staffNo);
    }

}
