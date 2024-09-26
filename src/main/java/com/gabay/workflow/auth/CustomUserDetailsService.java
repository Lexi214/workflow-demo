package com.gabay.workflow.auth;

import com.gabay.workflow.entity.StaffInfo;
import com.gabay.workflow.service.StaffInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private StaffInfoService staffInfoService;

    @Override
    public UserDetails loadUserByUsername(String staffNo) throws UsernameNotFoundException {
        StaffInfo staffInfo = staffInfoService.getStaffInfoByStaffNo(staffNo);
        if (staffInfo == null) {
            throw new UsernameNotFoundException("Staff No. not exist! ");
        }
        return staffInfo;
    }
}
