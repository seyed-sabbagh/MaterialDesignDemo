/*
 * Created by Seyed on 8/3/21, 2:09 PM
 * Copyright (c) 2021 . All rights reserved.
 * Last modified 8/3/21, 12:09 PM
 */

package com.Seyed.materialdesign.model;

import java.io.Serializable;

public class MyAppsModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String imageUrl;
    private String packageName;
    private String googlePlayUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getGooglePlayUrl() {
        return googlePlayUrl;
    }

    public void setGooglePlayUrl(String googlePlayUrl) {
        this.googlePlayUrl = googlePlayUrl;
    }
}
