package com.bootdo.image_check.service;

import com.bootdo.image_check.domain.ImageCheckDO;
import com.bootdo.image_check.domain.ImageCheckViewDO;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
public interface ImageCheckService {
	
	ImageCheckDO get(Integer id);
	
	List<ImageCheckViewDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(ImageCheckDO imageCheck);
	
	int update(ImageCheckDO imageCheck);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);

	Double sum(Map<String, Object> map);
}
