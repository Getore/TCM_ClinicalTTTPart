package com.bootdo.shenli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shenli.dao.LogDao;
import com.bootdo.shenli.domain.LogDO;
import com.bootdo.shenli.service.LogService;



@Service
public class LogServiceImpl implements LogService {
	@Autowired
	private LogDao logDao;
	
	@Override
	public LogDO get(String projectname){
		return logDao.get(projectname);
	}
	
	@Override
	public List<LogDO> list(Map<String, Object> map){
		return logDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return logDao.count(map);
	}
	
	@Override
	public int save(LogDO log){
		return logDao.save(log);
	}
	
	@Override
	public int update(LogDO log){
		return logDao.update(log);
	}
	
	@Override
	public int remove(String projectname){
		return logDao.remove(projectname);
	}
	
	@Override
	public int batchRemove(String[] projectnames){
		return logDao.batchRemove(projectnames);
	}
	
}
