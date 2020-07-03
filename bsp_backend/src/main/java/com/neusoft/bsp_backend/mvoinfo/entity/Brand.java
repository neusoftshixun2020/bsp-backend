package com.neusoft.bsp_backend.mvoinfo.entity;

import com.neusoft.bsp_backend.common.base.BaseEntity;
import com.neusoft.bsp_backend.common.validationGroup.DeleteGroup;
import com.neusoft.bsp_backend.common.validationGroup.InsertGroup;
import com.neusoft.bsp_backend.common.validationGroup.SelectGroup;
import com.neusoft.bsp_backend.common.validationGroup.UpdateGroup;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

public class Brand implements BaseEntity {

    int brd_id;
    int man_id;
    int image_id;
    String name_en;
    String name_cn;
    String created_by;
    Timestamp creation_date;
    String last_update_by;
    Timestamp last_update_date;
    int call_cnt;
    String remark;
    char sts_cd;

    public Integer getId() {return brd_id;}

    public int getBrd_id() {
        return brd_id;
    }

    public void setBrd_id(int brd_id) {
        this.brd_id = brd_id;
    }

    public int getMan_id() {
        return man_id;
    }

    public void setMan_id(int man_id) {
        this.man_id = man_id;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_cn() {
        return name_cn;
    }

    public void setName_cn(String name_cn) {
        this.name_cn = name_cn;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Timestamp creation_date) {
        this.creation_date = creation_date;
    }

    public String getLast_update_by() {
        return last_update_by;
    }

    public void setLast_update_by(String last_update_by) {
        this.last_update_by = last_update_by;
    }

    public Timestamp getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Timestamp last_update_date) {
        this.last_update_date = last_update_date;
    }

    public int getCall_cnt() {
        return call_cnt;
    }

    public void setCall_cnt(int call_cnt) {
        this.call_cnt = call_cnt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public char getSts_cd() {
        return sts_cd;
    }

    public void setSts_cd(char sts_cd) {
        this.sts_cd = sts_cd;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brd_id=" + brd_id +
                ", man_id=" + man_id +
                ", image_id=" + image_id +
                ", name_en='" + name_en + '\'' +
                ", name_cn='" + name_cn + '\'' +
                ", created_by='" + created_by + '\'' +
                ", creation_date=" + creation_date +
                ", last_update_by='" + last_update_by + '\'' +
                ", last_update_date=" + last_update_date +
                ", call_cnt=" + call_cnt +
                ", remark='" + remark + '\'' +
                ", sts_cd=" + sts_cd +
                '}';
    }
}
