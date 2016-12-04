package com.hhsj.bannertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.hhsj.library.banner.config.BannerConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button button1 = (Button) findViewById(R.id.not_indicator);
        Button button2 = (Button) findViewById(R.id.circle_indicator);
        Button button3 = (Button) findViewById(R.id.num_indicator);
        Button button4 = (Button) findViewById(R.id.num_indicator_title);
        Button button5 = (Button) findViewById(R.id.circle_indicator_title);
        Button button6 = (Button) findViewById(R.id.circle_indicator_title_inside);
        Button button7 = (Button) findViewById(R.id.left);
        Button button8 = (Button) findViewById(R.id.center);
        Button button9 = (Button) findViewById(R.id.right);
        Button button10 = (Button) findViewById(R.id.zoomout);
        Button button11 = (Button) findViewById(R.id.depth);
        Button button12 = (Button) findViewById(R.id.rotatedown);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NOT_INDICATOR, -1, -1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR, -1, -1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NUM_INDICATOR, -1, -1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NUM_INDICATOR_TITLE, -1, -1);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR_TITLE, -1, -1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE, -1, -1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR, BannerConfig.LEFT, -1);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR, BannerConfig.CENTER, -1);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.CIRCLE_INDICATOR, BannerConfig.RIGHT, -1);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NOT_INDICATOR, -1, BannerConfig.ZOOMOUT);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NOT_INDICATOR, -1, BannerConfig.DEPTH);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toTestActivity(BannerConfig.NOT_INDICATOR, -1, BannerConfig.ROTATEDOWN);
            }
        });

    }

    void toTestActivity(int indicator, int grative, int animation) {
        Intent intent = new Intent(this, TestActivity.class);
        intent.putExtra("INDICATOR", indicator);
        intent.putExtra("GRAVITY", grative);
        intent.putExtra("ANIMATION", animation);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
