package com.vip.items.mapper;

import com.vip.items.domain.entity.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    List<Project> findAll(@Param("page")int page,@Param("size")int size);
}