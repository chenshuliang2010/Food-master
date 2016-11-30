package com.csl.food.http.service;

import com.csl.food.bean.FoodSummary;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @name: Food-master
 * @class name：com.csl.food.http.service
 * @Fuction : 请求网络服务数据
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 22:38
 * @change:
 * @chang :time
 * @class :describe
 */
public interface FoodService {
    /**
     *
     * @param id 分类ID，默认返回的是全部
     * @param rows 每页返回的条数，默认rows=20
     * @param page 请求页数，默认page=1
     * @return 被观察对象
     */
    @GET("api/food/list")
    Observable<FoodSummary> getFoodList(
            @Query("id") int id,
            @Query("page")int page,
            @Query("rows")int rows);
}
