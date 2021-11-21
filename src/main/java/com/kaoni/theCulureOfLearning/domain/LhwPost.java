package com.kaoni.theCulureOfLearning.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LhwPost implements Serializable {
    private static final long serialVersionUID = 1L;
    public int no;
    public String title;
    public String contents;
    public Date write_date;
}
