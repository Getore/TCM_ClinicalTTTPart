package com.bootdo.shenli.service;

import com.bootdo.shenli.domain.LogDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-27 16:35:34
 */
public interface LogService {
	
	LogDO get(String projectname);
	
	List<LogDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LogDO log);
	
	int update(LogDO log);
	
	int remove(String projectname);
	
	int batchRemove(String[] projectnames);
}
