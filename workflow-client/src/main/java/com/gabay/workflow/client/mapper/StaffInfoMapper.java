package com.gabay.workflow.client.mapper;

import com.gabay.workflow.client.entity.StaffInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffInfoMapper {

    StaffInfo selectStaffInfoByStaffNo(String staffNo);

}
