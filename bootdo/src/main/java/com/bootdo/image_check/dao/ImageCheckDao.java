package com.bootdo.image_check.dao;

import com.bootdo.image_check.domain.ImageCheckDO;

import java.util.List;
import java.util.Map;

import com.bootdo.image_check.domain.ImageCheckViewDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
@Mapper
public interface ImageCheckDao {

	ImageCheckDO get(Integer id);
	
	List<ImageCheckViewDO> list(Map<String,Object> map);

	int count(Map<String,Object> map);
	
	int save(ImageCheckDO imageCheck);
	
	int update(ImageCheckDO imageCheck);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	Double sum();
}
