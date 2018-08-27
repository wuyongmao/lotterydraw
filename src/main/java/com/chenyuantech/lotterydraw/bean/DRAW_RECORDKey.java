package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class DRAW_RECORDKey implements Serializable {
    private BigDecimal ND;

    private String GEN01;

    private static final long serialVersionUID = 1L;

    public BigDecimal getND() {
        return ND;
    }

    public void setND(BigDecimal ND) {
        this.ND = ND;
    }

    public String getGEN01() {
        return GEN01;
    }

    public void setGEN01(String GEN01) {
        this.GEN01 = GEN01;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ND=").append(ND);
        sb.append(", GEN01=").append(GEN01);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}