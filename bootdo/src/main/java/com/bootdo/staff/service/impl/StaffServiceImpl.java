package com.bootdo.staff.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.staff.dao.StaffDao;
import com.bootdo.staff.domain.StaffDO;
import com.bootdo.staff.service.StaffService;



@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffDao staffDao;
	
	@Override
	public StaffDO get(Integer id){
		return staffDao.get(id);
	}
	
	@Override
	public List<StaffDO> list(Map<String, Object> map){
		return staffDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return staffDao.count(map);
	}
	
	@Override
	public int save(StaffDO staff){
		return staffDao.save(staff);
	}
	
	@Override
	public int update(StaffDO staff){
		return staffDao.update(staff);
	}
	
	@Override
	public int remove(Integer id){
		return staffDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return staffDao.batchRemove(ids);
	}
	
}
