package com.kaoni.theCulureOfLearning.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Member {
    public String id;
    public String pass;
    public String name;
    public Date joinDate;
}
