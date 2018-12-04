package com.example.demo.entity;

import java.io.Serializable;

public class School implements Serializable {
    private static final long serialVersionUID = -1369148652554782331L;

    private int id;
    private String yuan_xiao_ming_cheng;
    private String yuan_xiao_suo_zai_di;
    private String yuan_xiao_li_shu;
    private String yuan_xiao_lei_xing;
    private String xue_li_ceng_ci;
    private String yuan_xiao_te_xing;
    private String yan_jiu_sheng_yuan;
    private String man_yi_du;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYuan_xiao_lei_xing() {
        return yuan_xiao_lei_xing;
    }

    public void setYuan_xiao_lei_xing(String yuan_xiao_lei_xing) {
        this.yuan_xiao_lei_xing = yuan_xiao_lei_xing;
    }

    public String getYuan_xiao_ming_cheng() {
        return yuan_xiao_ming_cheng;
    }

    public void setYuan_xiao_ming_cheng(String yuan_xiao_ming_cheng) {
        this.yuan_xiao_ming_cheng = yuan_xiao_ming_cheng;
    }

    public String getYuan_xiao_suo_zai_di() {
        return yuan_xiao_suo_zai_di;
    }

    public void setYuan_xiao_suo_zai_di(String yuan_xiao_suo_zai_di) {
        this.yuan_xiao_suo_zai_di = yuan_xiao_suo_zai_di;
    }

    public String getYuan_xiao_li_shu() {
        return yuan_xiao_li_shu;
    }

    public void setYuan_xiao_li_shu(String yuan_xiao_li_shu) {
        this.yuan_xiao_li_shu = yuan_xiao_li_shu;
    }

    public String getXue_li_ceng_ci() {
        return xue_li_ceng_ci;
    }

    public void setXue_li_ceng_ci(String xue_li_ceng_ci) {
        this.xue_li_ceng_ci = xue_li_ceng_ci;
    }

    public String getYuan_xiao_te_xing() {
        return yuan_xiao_te_xing;
    }

    public void setYuan_xiao_te_xing(String yuan_xiao_te_xing) {
        this.yuan_xiao_te_xing = yuan_xiao_te_xing;
    }

    public String getYan_jiu_sheng_yuan() {
        return yan_jiu_sheng_yuan;
    }

    public void setYan_jiu_sheng_yuan(String yan_jiu_sheng_yuan) {
        this.yan_jiu_sheng_yuan = yan_jiu_sheng_yuan;
    }

    public String getMan_yi_du() {
        return man_yi_du;
    }

    public void setMan_yi_du(String man_yi_du) {
        this.man_yi_du = man_yi_du;
    }
}
