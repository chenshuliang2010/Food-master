package com.csl.food.module.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.csl.food.R;
import com.csl.food.base.BaseRecyclerAdapter;
import com.csl.food.base.BaseRecyclerViewHolder;
import com.csl.food.base.BaseSpacesItemDecoration;
import com.csl.food.bean.FoodSummary;
import com.csl.food.callback.OnItemClickAdapter;
import com.csl.food.common.DataLoadType;
import com.csl.food.module.model.FoodListInteractorImpl;
import com.csl.food.module.presenter.FoodListPresenterImpl;
import com.csl.food.module.view.FoodListView;
import com.csl.food.utils.MeasureUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * 菜谱列表界面
 */
public class MainActivity extends AppCompatActivity implements FoodListView {
    private FoodListPresenterImpl mFoodListPresenterImpl;
    private BaseRecyclerAdapter<FoodSummary.TngouEntity> mAdapter;
    private RecyclerView mRecyclerView;
    //Loading弹框
    private ProgressDialog mProgressDialog;


    //食品名称详情
    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {

        mRecyclerView=(RecyclerView)findViewById(R.id.rv_list);

        mButton=(Button)findViewById(R.id.btIntent);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FoodNameActivity.class));
            }
        });




        /////////////////////////

        //初始化Loading
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Loading");


        mFoodListPresenterImpl=new FoodListPresenterImpl(this);
    }

    @Override
    public void updateFoodList(List<FoodSummary.TngouEntity> data, @NonNull String errorMsg, @DataLoadType.DataLoadTypeChecker int type) {
        if (mAdapter==null){
            initFoodList(data);
        }
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

    //适配器方法
    private void initFoodList(List<FoodSummary.TngouEntity> data) {

        // mAdapter为空肯定为第一次进入状态
        mAdapter = new BaseRecyclerAdapter<FoodSummary.TngouEntity>(this, data){

            @Override
            public int getItemLayoutId(int viewType) {
                return R.layout.item_food_list;
            }

            @Override
            public void bindData(BaseRecyclerViewHolder holder, int position, FoodSummary.TngouEntity item) {
                //两种图片加载框架，后者比较好
               // Picasso.with(MainActivity.this).load("http://tnfs.tngou.net/image"+item.img).into(holder.getImageView(R.id.iv_food_image));
                Glide.with(MainActivity.this).load("http://tnfs.tngou.net/image"+item.img).into(holder.getImageView(R.id.iv_food_image));

                holder.getTextView(R.id.tv_food_title).setText(item.name);
                holder.getTextView(R.id.tv_food_content).setText(item.description);

            }


        };
        //点击响应事件
        mAdapter.setOnItemClickListener(new OnItemClickAdapter() {
                @Override
                public void onItemClick(View view, int position) {
                    super.onItemClick(view, position);
                    Intent intent=new Intent(MainActivity.this,ParticularsActivity.class);
                    intent.putExtra("image",mAdapter.getData().get(position).img);
                    intent.putExtra("content",mAdapter.getData().get(position).description);
                    startActivity(intent);

                }

            });






        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.addItemDecoration(new BaseSpacesItemDecoration(MeasureUtil.dip2px(this, 4)));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.getItemAnimator().setAddDuration(250);
        mRecyclerView.getItemAnimator().setMoveDuration(250);
        mRecyclerView.getItemAnimator().setChangeDuration(250);
        mRecyclerView.getItemAnimator().setRemoveDuration(250);
        mRecyclerView.setAdapter(mAdapter);

    }

}
