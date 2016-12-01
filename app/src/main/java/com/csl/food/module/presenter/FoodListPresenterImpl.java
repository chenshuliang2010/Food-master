package com.csl.food.module.presenter;

import com.csl.food.base.BasePresenterImpl;
import com.csl.food.bean.FoodSummary;
import com.csl.food.common.DataLoadType;
import com.csl.food.module.model.FoodListInteractor;
import com.csl.food.module.model.FoodListInteractorImpl;
import com.csl.food.module.view.FoodListView;
import com.csl.food.utils.LogUtils;

import java.util.List;

/**
 * @name: Food-master
 * @class name：com.csl.food.module.presenter
 * @Fuction : 菜谱列表代理接口实现
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 23:18
 * @change:
 * @chang :time
 * @class :describe
 */
public class FoodListPresenterImpl extends BasePresenterImpl<FoodListView,List<FoodSummary.TngouEntity>>
    implements FoodListPresenter{


    private FoodListInteractor<List<FoodSummary.TngouEntity>> mFoodListInteractor;
    private boolean mHasInit;
    private boolean mIsRefresh = true;
    /**
     * 构造方法
     *
     * @param view 具体业务的接口对象
     */
    public FoodListPresenterImpl(FoodListView view) {
        super(view);
        mFoodListInteractor=new FoodListInteractorImpl();
        mSubscription=mFoodListInteractor.requestFoodList(this);
    }

    @Override
    public void beforeRequest() {
        super.beforeRequest();
        if (!mHasInit){
            mHasInit=true;
            mView.showProgress();
        }
    }
    @Override
    public void requestError(String msg) {
        super.requestError(msg);
        mView.updateFoodList(null,msg,mIsRefresh? DataLoadType.TYPE_REFRESH_FAIL:DataLoadType.TYPE_LOAD_MORE_FAIL);
    }
    @Override
    public void requestComplete() {
        super.requestComplete();
    }


    @Override
    public void requestSuccess(List<FoodSummary.TngouEntity> data) {
        LogUtils.d("Box0fficeSummary>>>>>>"+data);
        mView.updateFoodList(data, "", mIsRefresh ? DataLoadType.TYPE_REFRESH_SUCCESS : DataLoadType.TYPE_LOAD_MORE_SUCCESS);
    }


    @Override
    public void refreshData() {

    }

    @Override
    public void loadMoreData() {

    }
}
