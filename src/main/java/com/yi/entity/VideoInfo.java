package com.yi.entity;

import java.util.Date;

public class VideoInfo {
    private Integer vid;

    private Integer cid;

    private String name;

    private Date time;

    private String onchoose;

    private String videoIntroduce;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getOnchoose() {
        return onchoose;
    }

    public void setOnchoose(String onchoose) {
        this.onchoose = onchoose == null ? null : onchoose.trim();
    }

    public String getVideoIntroduce() {
        return videoIntroduce;
    }

    public void setVideoIntroduce(String videoIntroduce) {
        this.videoIntroduce = videoIntroduce == null ? null : videoIntroduce.trim();
    }
}