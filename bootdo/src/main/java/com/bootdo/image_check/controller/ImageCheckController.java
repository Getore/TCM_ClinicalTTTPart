package com.bootdo.image_check.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.image_check.domain.ImageCheckViewDO;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.image_check.domain.ImageCheckDO;
import com.bootdo.image_check.service.ImageCheckService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

import javax.servlet.http.HttpServletResponse;

/**
 * 图片检测结果查询
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
 
@Controller
@RequestMapping("/image_check/imageCheck")
public class ImageCheckController {
	@Autowired
	private ImageCheckService imageCheckService;
	
	@GetMapping()
	@RequiresPermissions("image_check:imageCheck:imageCheck")
	String ImageCheck(){
	    return "image_check/imageCheck/imageCheck";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("image_check:imageCheck:imageCheck")
	public PageUtils list(@RequestParam Map<String, Object> params){
		// 查询列表数据
        Query query = new Query(params);
		List<ImageCheckViewDO> imageCheckList = imageCheckService.list(query);
		int total = imageCheckService.count(query);
		PageUtils pageUtils = new PageUtils(imageCheckList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("image_check:imageCheck:add")
	String add(){
	    return "image_check/imageCheck/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("image_check:imageCheck:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		ImageCheckDO imageCheck = imageCheckService.get(id);
		model.addAttribute("imageCheck", imageCheck);
	    return "image_check/imageCheck/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("image_check:imageCheck:add")
	public R save( ImageCheckDO imageCheck){
		if(imageCheckService.save(imageCheck)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("image_check:imageCheck:edit")
	public R update( ImageCheckDO imageCheck){
		imageCheckService.update(imageCheck);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("image_check:imageCheck:remove")
	public R remove( Integer id){
		if(imageCheckService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 批量删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("image_check:imageCheck:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		imageCheckService.batchRemove(ids);
		return R.ok();
	}


	/**
	 * shenli
	 *
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/sum")
	public Double sum(@RequestParam Map<String, Object> params) throws Exception{
		Query query = new Query(params);
		double sum = imageCheckService.sum(query);
		return sum;
	}

}
