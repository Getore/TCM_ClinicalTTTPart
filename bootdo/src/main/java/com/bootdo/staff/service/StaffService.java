package com.bootdo.staff.service;

import com.bootdo.staff.domain.StaffDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-28 09:56:21
 */
public interface StaffService {
	
	StaffDO get(Integer id);
	
	List<StaffDO> list(Map<String, Object> map);

	List<StaffDO> excelList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StaffDO staff);
	
	int update(StaffDO staff);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
