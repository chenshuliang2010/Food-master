package com.csl.food.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @name: Food-master
 * @class name：com.csl.food.bean
 * @Fuction : 食品名称详情接口
 * @anthor :csl QQ:870588442
 * @time :2016/12/13 14:29
 * @change:
 * @chang :time
 * @class :describe
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodEntity {
    @JsonProperty("name")
    public String name;//
    @JsonProperty("infoclass")
    public int infoclass;//分类
    @JsonProperty("img")
    public String img;//图片
    @JsonProperty("description")
    public String description;//描述
    @JsonProperty("keywords")
    public String keywords;//关键字
    @JsonProperty("message")
    public String message;//资讯内容
    @JsonProperty("count")
    public int count ;//访问次数
    @JsonProperty("fcount")
    public int fcount;//收藏数
    @JsonProperty("rcount")
    public int rcount;//评论读数
    @JsonProperty("disease")
    public String disease ;//相关疾病
    @JsonProperty("food")
    public String food ;//相关食物
    @JsonProperty("summary")
    public String summary ;//简介

}
