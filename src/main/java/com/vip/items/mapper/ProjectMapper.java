package com.vip.items.mapper;

import com.vip.items.domain.entity.Project;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    List<Project> findAll(@Param("cateId")int cateId,
                          @Param("menu2Id")int menu2Id,
                          @Param("menu3Id")int menu3Id);
    List<Project>  findDisplay();


}