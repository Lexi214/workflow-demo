package com.gabay.workflow.mapper;

import com.gabay.workflow.entity.StaffInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffInfoMapper {

    StaffInfo selectStaffInfoByStaffNo(String staffNo);

}
