package com.hhsj.bannertest;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.util.Util;
import com.hhsj.bannertest.bean.BannerData;
import com.hhsj.library.banner.BannerView;
import com.hhsj.library.banner.config.BannerConfig;
import com.hhsj.library.banner.interfaces.IBannerUrl;

/**
 * Created by shaohua on 2016/12/3.
 */

public class TestActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        BannerView bannerView = (BannerView) findViewById(R.id.bannerview);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            bannerView.getLayoutParams().height = getWindowManager().getDefaultDisplay().getMode().getPhysicalWidth()*9/16;
        }
        int indicator = getIntent().getIntExtra("INDICATOR", BannerConfig.NOT_INDICATOR);
        int grative = getIntent().getIntExtra("GRAVITY", -1);
        int transformer = getIntent().getIntExtra("ANIMATION", -1);


        int size = 2;
        IBannerUrl[] bannerList = new BannerData[]{new BannerData("file:///android_asset/pentakill_1.jpg"),
                new BannerData("file:///android_asset/pentakill_2.jpg")};

        if (bannerList.length > 0) {
            bannerView.setBannerStyle(indicator);

            if (indicator == BannerConfig.CIRCLE_INDICATOR_TITLE ||
                    indicator == BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE ||
                    indicator == BannerConfig.NUM_INDICATOR_TITLE) {
                bannerView.setBannerTitle(new String[]{"傲之追猎者", "深渊巨口"});
            }
            if (grative > -1) {
                bannerView.setIndicatorGravity(grative);
            }
            if (transformer > -1) {
                bannerView.setBannerAnimation(transformer);
            }
            bannerView.setOnBannerImageListener(new BannerView.OnLoadImageListener() {
                @Override
                public void OnLoadImage(ImageView view, IBannerUrl url) {
                    Glide.with(TestActivity.this).load(url.getUrl()).into(view);
                }
            });

            /**
             * 添加数据
             */
            bannerView.setAutoPlayEnable(true);
            bannerView.setImages(bannerList);
        }
    }
}
