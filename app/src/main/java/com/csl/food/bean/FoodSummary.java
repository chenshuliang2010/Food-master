package com.csl.food.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @name: Food-master
 * @class name：com.csl.food.bean
 * @Fuction : 食品列表实体类
 * @anthor :csl QQ:870588442
 * @time :2016/11/30 19:32
 * @change:
 * @chang :time
 * @class :describe
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FoodSummary {
    @JsonProperty("status")
    public boolean status;
    @JsonProperty("total")
    public int total;
    @JsonProperty("tngou")
    public List<TngouEntity> tngou;

    /**
     * "count": 5239,
     "description": "棕榈油的话你可以尝尝味道有没有酸味，最好是让对方提供一份检验报告之类的东西，还有就是油的色泽，是否澄清透明",
     "disease": "胆固醇脓胸,家族性高胆固醇血症,猝死型冠心病,胆囊胆固醇沉着症,磷脂酰胆碱-胆固醇酰基转移酶缺乏,胆固醇肺炎,小儿细胞外胆固醇沉着综合征,蓝鼓膜与胆固醇肉芽肿,冠心病",
     "fcount": 0,
     "food": "板绞油,油抒,羊油,玉米油,玛琪琳,裹入油,油皮,油面,油豆角,油豆腐,鸭油,鹅油卷,青甘鱼,酱油露,白脱油,芝麻油,牛油汁,炼制猪油,胡麻油,棕榈油,猪网油,猪背油",
     "id": 1599,
     "img": "/food/150804/2ad85610af25a980b5fd6d1828bbade1.jpg",
     "keywords": "棕榈油 体质 食用 就是 饱和 ",
     "name": "棕榈油",
     "rcount": 0,
     "summary": "<p>【性质】平</p> \n<p>【五味】辛</p> \n<p>【热量】900.00大卡(千焦)/100克 </p> \n<p>【功效】抑癌抗瘤</p> \n<p>【棕榈油是什么】 棕榈油是从油棕树上的棕果(Elaeis Guineensis)中榨取出来的，果肉压榨出的油称为棕榈油( Palm Oil)，而果仁压榨出的油称为棕榈仁油(Palm Kernel Oil)，两种油的成分大不相同。棕榈油主要含有棕榈酸(C 16)和油酸(C 18)两种最普通的脂肪酸，棕榈油的饱和程度约为50%;棕榈仁油主要含有月桂酸(C 12)，饱和程度达80...</p>",
     "symptom": "煤尘或胆固醇结晶的黏痰,近迫性心肌梗塞,痉挛性偏瘫步态,脑血管痉挛,血浆胆固醇水平高,心脑血管意外,脑血管动静脉畸形,对侧肢体偏瘫,偏瘫"
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TngouEntity{
        @JsonProperty("count")
        public int count;
        @JsonProperty("description")
        public String description;
        @JsonProperty("disease")
        public String disease;
        @JsonProperty("fcount")
        public int fcount;
        @JsonProperty("food")
        public String food;
        @JsonProperty("id")
        public int id;
        @JsonProperty("img")
        public String img;
        @JsonProperty("keywords")
        public String keywords;
        @JsonProperty("name")
        public String name;
        @JsonProperty("rcount")
        public int rcount;
        @JsonProperty("summary")
        public String summary;
        @JsonProperty("symptom")
        public String symptom;

    }

}
