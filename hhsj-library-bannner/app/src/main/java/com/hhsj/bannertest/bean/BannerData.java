package com.hhsj.bannertest.bean;

import com.hhsj.library.banner.interfaces.IBannerUrl;

/**
 * Created by shaohua on 2016/12/3.
 */

public class BannerData implements IBannerUrl {

    String url;

    public BannerData(String url) {
        this.url = url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return url;
    }
}
