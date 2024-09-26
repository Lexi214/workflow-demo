package com.gabay.workflow.service.impl;

import com.gabay.workflow.entity.StaffInfo;
import com.gabay.workflow.mapper.StaffInfoMapper;
import com.gabay.workflow.service.StaffInfoService;
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
