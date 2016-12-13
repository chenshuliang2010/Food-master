package com.csl.food.module.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.csl.food.R;
import com.csl.food.bean.FoodEntity;
import com.csl.food.module.presenter.FoodNamePresenterImpl;
import com.csl.food.module.view.FoodNameView;

public class FoodNameActivity extends AppCompatActivity implements FoodNameView, View.OnClickListener {
    //食物的EditText
    private EditText foodName;
    //获取食物名称的按钮
    private Button foodNameConfirm;
    //用于显示最后获取的结果
    private TextView foodNameContent;
    private TextView foodNameContent2;
    private TextView foodNameContent3;
    private TextView foodNameContent4;
    private TextView foodNameContent5;
    private TextView foodNameContent6;
    private TextView foodNameContent7;
    private TextView foodNameContent8;


    //获取食物详情的代理对象
    private FoodNamePresenterImpl mFoodNamePresenterImpl;

    //Loading弹框
    private ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_name);
        initView();
    }

    //初始化控件
    private void initView() {
        foodName=(EditText)findViewById(R.id.etHint);
        foodNameConfirm=(Button)findViewById(R.id.btConfirm);
        foodNameContent=(TextView)findViewById(R.id.tvContent);
        foodNameContent2=(TextView)findViewById(R.id.tvContent2);
        foodNameContent3=(TextView)findViewById(R.id.tvContent3);
        foodNameContent4=(TextView)findViewById(R.id.tvContent4);


        foodNameConfirm.setOnClickListener(this);

        //初始化Loading
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Loading");


    }

    @Override
    public void initViewPager(FoodEntity foodName) {

        foodNameContent.setText(foodName.name);
        foodNameContent2.setText(foodName.keywords);
        foodNameContent3.setText(foodName.description);
        foodNameContent4.setText(foodName.message);


    }

    @Override
    public void toast(String msg) {

    }

    @Override
    public void showProgress() {
        if (null != mProgressDialog && !mProgressDialog.isShowing()) {
            mProgressDialog.show();
        }
    }

    @Override
    public void hideProgress() {
        if (null != mProgressDialog && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onClick(View view) {
        mFoodNamePresenterImpl=new FoodNamePresenterImpl(this,foodName.getText().toString());
    }
}
