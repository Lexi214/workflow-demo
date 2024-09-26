package com.gabay.workflow.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class StaffInfo implements Serializable {

    private Long id;

    private Long leaderId;

    private Integer level;

    private String password;

    private String staffNo;

    private String username;

}
