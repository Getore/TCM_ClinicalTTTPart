package com.bootdo.image_check.service;

import com.bootdo.image_check.domain.CheckErrorDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
public interface CheckErrorService {
	
	CheckErrorDO get(Integer id);
	
	List<CheckErrorDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CheckErrorDO checkError);
	
	int update(CheckErrorDO checkError);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
