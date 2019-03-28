package com.bootdo.staff.dao;

import com.bootdo.staff.domain.StaffDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-28 09:56:21
 */
@Mapper
public interface StaffDao {

	StaffDO get(Integer id);
	
	List<StaffDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(StaffDO staff);
	
	int update(StaffDO staff);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
