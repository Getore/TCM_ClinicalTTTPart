package com.bootdo.pc_image_check.dao;

import com.bootdo.pc_image_check.domain.ImageCheckDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 14:51:38
 */
@Mapper
public interface ImageCheckDao {

	ImageCheckDO get(Integer id);
	
	List<ImageCheckDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ImageCheckDO imageCheck);
	
	int update(ImageCheckDO imageCheck);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
