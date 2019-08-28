package com.vip.items.mapper;

import com.vip.items.domain.entity.Collection1;
import org.apache.ibatis.annotations.Param;

public interface Collection1Mapper {
    int add(@Param("cid")int cid,@Param("proid")int proid,@Param("isDelete")int isDelete);
    int update(@Param("cid")int cid,@Param("isDelete")int isDelete);
    Collection1 findById(@Param("cid")int cid);
}