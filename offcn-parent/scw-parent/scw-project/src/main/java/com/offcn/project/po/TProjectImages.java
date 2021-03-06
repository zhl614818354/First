package com.offcn.project.po;

import java.io.Serializable;

public class TProjectImages implements Serializable {
    private Integer id;

    private Integer projectid;

    private String imgurl;

    private Byte imgtype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    @Override
    public String toString() {
        return "TProjectImages{" +
                "id=" + id +
                ", projectid=" + projectid +
                ", imgurl='" + imgurl + '\'' +
                ", imgtype=" + imgtype +
                '}';
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Byte getImgtype() {
        return imgtype;
    }

    public void setImgtype(Byte imgtype) {
        this.imgtype = imgtype;
    }

    public TProjectImages(Integer id, Integer projectid, String imgurl, Byte imgtype) {
        this.id = id;
        this.projectid = projectid;
        this.imgurl = imgurl;
        this.imgtype = imgtype;
    }
}