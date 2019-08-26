package com.vip.items.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Project {
    /**
    * 项目id
    */
    private Integer proid;

    /**
    * 项目名
    */
    private String proName;

    /**
    * 预算
    */
    private String money;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 一级分类id
    */
    private Integer cateId;

    /**
    * 二级分类id
    */
    private Integer menu2Id;

    /**
    * 三级分类id
    */
    private Integer menu3Id;

    /**
    * 联系电话
    */
    private String tel;

    /**
    * 状态,0 存在,1 删除
    */
    private Integer isDelete;
}