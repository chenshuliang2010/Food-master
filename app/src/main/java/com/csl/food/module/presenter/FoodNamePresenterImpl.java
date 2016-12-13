package com.csl.food.module.presenter;

import com.csl.food.base.BasePresenterImpl;
import com.csl.food.bean.FoodEntity;
import com.csl.food.module.model.FoodNameInteractor;
import com.csl.food.module.model.FoodNameInteractorImpl;
import com.csl.food.module.view.FoodNameView;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.presenter
 * @Fuction : 食品名称查询代理接口实现
 * @anthor :csl QQ:870588442
 * @time :2016/12/13 14:57
 * @change:
 * @chang :time
 * @class :describe
 */
public class FoodNamePresenterImpl extends BasePresenterImpl<FoodNameView,FoodEntity>
        implements FoodNamePresenter{
    private FoodNameInteractor<FoodEntity> mFoodName;

    /**
     * 构造方法
     *
     * @param view 具体业务的接口对象
     */
    public FoodNamePresenterImpl(FoodNameView view,String name) {
        super(view);
        mFoodName=new FoodNameInteractorImpl();
//        if (data != null) {
//            mView.initViewPager(data);
//        } else {
//
//        }
        mSubscription=mFoodName.requestFoodName(this,name);

    }

    @Override
    public void requestSuccess(FoodEntity data) {
        super.requestSuccess(data);
        mView.initViewPager(data);
    }

    @Override
    public void requestError(String msg) {
        super.requestError(msg);
        mView.toast(msg);
    }


}
