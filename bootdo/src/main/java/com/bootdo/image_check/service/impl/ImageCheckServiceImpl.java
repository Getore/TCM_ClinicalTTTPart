package com.bootdo.image_check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.image_check.dao.ImageCheckDao;
import com.bootdo.image_check.domain.ImageCheckDO;
import com.bootdo.image_check.service.ImageCheckService;



@Service
public class ImageCheckServiceImpl implements ImageCheckService {
	@Autowired
	private ImageCheckDao imageCheckDao;
	
	@Override
	public ImageCheckDO get(Integer id){
		return imageCheckDao.get(id);
	}
	
	@Override
	public List<ImageCheckDO> list(Map<String, Object> map){
		return imageCheckDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return imageCheckDao.count(map);
	}
	
	@Override
	public int save(ImageCheckDO imageCheck){
		return imageCheckDao.save(imageCheck);
	}
	
	@Override
	public int update(ImageCheckDO imageCheck){
		return imageCheckDao.update(imageCheck);
	}
	
	@Override
	public int remove(Integer id){
		return imageCheckDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return imageCheckDao.batchRemove(ids);
	}
	
}
