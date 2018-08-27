package com.chenyuantech.lotterydraw.bean;

import java.io.Serializable;

public class DRAW_USER implements Serializable {
    private String ZX01;

    private String ZX02;

    private String ZX03;

    private String ZXACTI;

    private String PASSWORD;

    private String DRAW_LEVEL;

    private static final long serialVersionUID = 1L;

    public String getZX01() {
        return ZX01;
    }

    public void setZX01(String ZX01) {
        this.ZX01 = ZX01;
    }

    public String getZX02() {
        return ZX02;
    }

    public void setZX02(String ZX02) {
        this.ZX02 = ZX02;
    }

    public String getZX03() {
        return ZX03;
    }

    public void setZX03(String ZX03) {
        this.ZX03 = ZX03;
    }

    public String getZXACTI() {
        return ZXACTI;
    }

    public void setZXACTI(String ZXACTI) {
        this.ZXACTI = ZXACTI;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getDRAW_LEVEL() {
        return DRAW_LEVEL;
    }

    public void setDRAW_LEVEL(String DRAW_LEVEL) {
        this.DRAW_LEVEL = DRAW_LEVEL;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ZX01=").append(ZX01);
        sb.append(", ZX02=").append(ZX02);
        sb.append(", ZX03=").append(ZX03);
        sb.append(", ZXACTI=").append(ZXACTI);
        sb.append(", PASSWORD=").append(PASSWORD);
        sb.append(", DRAW_LEVEL=").append(DRAW_LEVEL);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}