package com.csl.food.module.view;

import android.support.annotation.NonNull;

import com.csl.food.base.BaseView;
import com.csl.food.bean.FoodSummary;
import com.csl.food.common.DataLoadType;

import java.util.List;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.view
 * @Fuction : describe
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 23:19
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodListView extends BaseView {
    void updateFoodList(List<FoodSummary.TngouEntity> data, @NonNull String errorMsg, @DataLoadType.DataLoadTypeChecker int type);
}
