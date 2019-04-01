package com.bootdo.image_check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.image_check.dao.CheckErrorDao;
import com.bootdo.image_check.domain.CheckErrorDO;
import com.bootdo.image_check.service.CheckErrorService;



@Service
public class CheckErrorServiceImpl implements CheckErrorService {
	@Autowired
	private CheckErrorDao checkErrorDao;
	
	@Override
	public CheckErrorDO get(Integer id){
		return checkErrorDao.get(id);
	}
	
	@Override
	public List<CheckErrorDO> list(Map<String, Object> map){
		return checkErrorDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return checkErrorDao.count(map);
	}
	
	@Override
	public int save(CheckErrorDO checkError){
		return checkErrorDao.save(checkError);
	}
	
	@Override
	public int update(CheckErrorDO checkError){
		return checkErrorDao.update(checkError);
	}
	
	@Override
	public int remove(Integer id){
		return checkErrorDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return checkErrorDao.batchRemove(ids);
	}
	
}
