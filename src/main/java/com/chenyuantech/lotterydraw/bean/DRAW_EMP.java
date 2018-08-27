package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.util.Date;

public class DRAW_EMP implements Serializable {
    private String GEN01;

    private String GEN02;

    private String GEM02;

    private String GEMACTI;

    private String GEN03;

    private String GENACTI;

    private Date GENDATE;

    private static final long serialVersionUID = 1L;

    public String getGEN01() {
        return GEN01;
    }

    public void setGEN01(String GEN01) {
        this.GEN01 = GEN01;
    }

    public String getGEN02() {
        return GEN02;
    }

    public void setGEN02(String GEN02) {
        this.GEN02 = GEN02;
    }

    public String getGEM02() {
        return GEM02;
    }

    public void setGEM02(String GEM02) {
        this.GEM02 = GEM02;
    }

    public String getGEMACTI() {
        return GEMACTI;
    }

    public void setGEMACTI(String GEMACTI) {
        this.GEMACTI = GEMACTI;
    }

    public String getGEN03() {
        return GEN03;
    }

    public void setGEN03(String GEN03) {
        this.GEN03 = GEN03;
    }

    public String getGENACTI() {
        return GENACTI;
    }

    public void setGENACTI(String GENACTI) {
        this.GENACTI = GENACTI;
    }

    public Date getGENDATE() {
        return GENDATE;
    }

    public void setGENDATE(Date GENDATE) {
        this.GENDATE = GENDATE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", GEN01=").append(GEN01);
        sb.append(", GEN02=").append(GEN02);
        sb.append(", GEM02=").append(GEM02);
        sb.append(", GEMACTI=").append(GEMACTI);
        sb.append(", GEN03=").append(GEN03);
        sb.append(", GENACTI=").append(GENACTI);
        sb.append(", GENDATE=").append(GENDATE);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}