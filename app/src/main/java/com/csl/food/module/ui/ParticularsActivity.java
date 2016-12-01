package com.csl.food.module.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.csl.food.R;

/**
 * 菜谱详情界面
 */
public class ParticularsActivity extends AppCompatActivity {
    private ImageView mParticularsImage;
    private TextView mParticularsContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particulars);
        initView();
    }
    //初始化组件
    private void initView() {
        Intent intent = this.getIntent();
        String content=intent.getStringExtra("content");
        String image=intent.getStringExtra("image");
       // mParticularsImage=(ImageView)findViewById(R.id.iv_particulars_image);
        Glide.with(this).load("http://tnfs.tngou.net/image"+image).into((ImageView)findViewById(R.id.iv_particulars_image));
        mParticularsContent=(TextView)findViewById(R.id.tv_particulars_content);
        mParticularsContent.setText(content);




    }

}
