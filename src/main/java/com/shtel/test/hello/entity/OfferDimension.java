package com.shtel.test.hello.entity;

public class OfferDimension {
    private Integer dimensionid;

    private String dimensionname;

    private Integer labbleid;

    private Integer number;

    public Integer getDimensionid() {
        return dimensionid;
    }

    public void setDimensionid(Integer dimensionid) {
        this.dimensionid = dimensionid;
    }

    public String getDimensionname() {
        return dimensionname;
    }

    public void setDimensionname(String dimensionname) {
        this.dimensionname = dimensionname == null ? null : dimensionname.trim();
    }

    public Integer getLabbleid() {
        return labbleid;
    }

    public void setLabbleid(Integer labbleid) {
        this.labbleid = labbleid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}