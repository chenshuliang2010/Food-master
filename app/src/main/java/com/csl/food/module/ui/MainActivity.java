package com.csl.food.module.ui;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.csl.food.R;
import com.csl.food.bean.FoodSummary;
import com.csl.food.common.DataLoadType;
import com.csl.food.module.model.FoodListInteractorImpl;
import com.csl.food.module.presenter.FoodListPresenterImpl;
import com.csl.food.module.view.FoodListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FoodListView {
    private FoodListPresenterImpl mFoodListPresenterImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFoodListPresenterImpl=new FoodListPresenterImpl(this);
    }

    @Override
    public void updateFoodList(List<FoodSummary.TngouEntity> data, @NonNull String errorMsg, @DataLoadType.DataLoadTypeChecker int type) {

    }

    @Override
    public void toast(String msg) {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
