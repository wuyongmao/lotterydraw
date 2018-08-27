package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class DRAW_AWARD extends DRAW_AWARDKey implements Serializable {
    private String AWARD;

    private BigDecimal AWARD_NUM;

    private BigDecimal ITEM;

    private String FLAG;

    private BigDecimal EVERYNUM;

    private String MANAGER;

    private static final long serialVersionUID = 1L;

    public String getAWARD() {
        return AWARD;
    }

    public void setAWARD(String AWARD) {
        this.AWARD = AWARD;
    }

    public BigDecimal getAWARD_NUM() {
        return AWARD_NUM;
    }

    public void setAWARD_NUM(BigDecimal AWARD_NUM) {
        this.AWARD_NUM = AWARD_NUM;
    }

    public BigDecimal getITEM() {
        return ITEM;
    }

    public void setITEM(BigDecimal ITEM) {
        this.ITEM = ITEM;
    }

    public String getFLAG() {
        return FLAG;
    }

    public void setFLAG(String FLAG) {
        this.FLAG = FLAG;
    }

    public BigDecimal getEVERYNUM() {
        return EVERYNUM;
    }

    public void setEVERYNUM(BigDecimal EVERYNUM) {
        this.EVERYNUM = EVERYNUM;
    }

    public String getMANAGER() {
        return MANAGER;
    }

    public void setMANAGER(String MANAGER) {
        this.MANAGER = MANAGER;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", AWARD=").append(AWARD);
        sb.append(", AWARD_NUM=").append(AWARD_NUM);
        sb.append(", ITEM=").append(ITEM);
        sb.append(", FLAG=").append(FLAG);
        sb.append(", EVERYNUM=").append(EVERYNUM);
        sb.append(", MANAGER=").append(MANAGER);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}