package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class DRAW_AWARDKey implements Serializable {
    private BigDecimal ND;

    private String AWARD_LEVEL;

    private static final long serialVersionUID = 1L;

    public BigDecimal getND() {
        return ND;
    }

    public void setND(BigDecimal ND) {
        this.ND = ND;
    }

    public String getAWARD_LEVEL() {
        return AWARD_LEVEL;
    }

    public void setAWARD_LEVEL(String AWARD_LEVEL) {
        this.AWARD_LEVEL = AWARD_LEVEL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ND=").append(ND);
        sb.append(", AWARD_LEVEL=").append(AWARD_LEVEL);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}