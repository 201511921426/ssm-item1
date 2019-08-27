package com.vip.items.service.impl;

import com.vip.items.domain.entity.*;
import com.vip.items.domain.vo.CategoryVo;
import com.vip.items.mapper.*;
import com.vip.items.service.IndexService;
import com.vip.items.utils.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
		@Resource
		NavigationMapper navigationMapper;
		@Resource
		CategoryMapper categoryMapper;
		@Resource
		ProjectMapper projectMapper;
		@Resource
		SubMenu2Mapper subMenu2Mapper;
		@Resource
		SubMenu3Mapper subMenu3Mapper;
		@Override
		public Bean finds() {
				Bean bean = new Bean();
				List<Navigation> all = navigationMapper.findAll();
				bean.setNavigations(all);
				return bean;
		}

		@Override
		public Bean find2() {
				Bean bean = new Bean();
				List<Category> all = categoryMapper.findAll();
				bean.setCategorylist(all);
				return bean;
		}

		@Override
		public Bean find3(int cateId,int menu2Id,int menu3Id) {
				Bean bean = new Bean();
				List<Project> all = projectMapper.findAll(cateId,menu2Id,menu3Id);
			bean.setProjectMappers(all);
			return bean;
		}

		@Override
		public Bean find4() {
				Bean bean = new Bean();
				List<SubMenu2> all = subMenu2Mapper.findAll();
				bean.setSubMenu2s(all);
				return bean;
		}

		@Override
		public Bean find5() {
				Bean bean = new Bean();
				List<SubMenu3> all = subMenu3Mapper.findAll();
				bean.setSubMenu3s(all);
				return bean;
		}

		@Override
		public Bean find6() {
				Bean bean = new Bean();
				List<Project> display = projectMapper.findDisplay();
				bean.setProjectMappers(display);
				return bean;
		}

		@Override
		public Bean find7() {
				Bean bean = new Bean();
				List<Category> projevt = categoryMapper.findProjevt();
				bean.setCategorylist(projevt);
				return bean;
		}


}
