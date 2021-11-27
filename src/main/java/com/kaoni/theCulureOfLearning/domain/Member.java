package com.kaoni.theCulureOfLearning.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Member implements Serializable {
    private static final long serialVersionUID = 1L;
    public String id;
    public String pass;
    public String name;
    public Date joinDate;
}
