package com.yi.entity;

public class Permission {
    private Integer permissionId;

    private String name;

    private String url;

    private String title;

    private String icon;

    private String parenttitle;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getParenttitle() {
        return parenttitle;
    }

    public void setParenttitle(String parenttitle) {
        this.parenttitle = parenttitle == null ? null : parenttitle.trim();
    }
}