package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;

public class DRAW_RECORD extends DRAW_RECORDKey implements Serializable {
    private String AWARD_LEVEL;

    private String FLAG;

    private static final long serialVersionUID = 1L;

    public String getAWARD_LEVEL() {
        return AWARD_LEVEL;
    }

    public void setAWARD_LEVEL(String AWARD_LEVEL) {
        this.AWARD_LEVEL = AWARD_LEVEL;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", AWARD_LEVEL=").append(AWARD_LEVEL);
        sb.append(", FLAG=").append(FLAG);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}