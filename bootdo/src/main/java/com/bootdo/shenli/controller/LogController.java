package com.bootdo.shenli.controller;

import java.util.List;
import java.util.Map;

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

import com.bootdo.shenli.domain.LogDO;
import com.bootdo.shenli.service.LogService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-27 16:35:34
 */
 
@Controller
@RequestMapping("/shenli/log")
public class LogController {
	@Autowired
	private LogService logService;
	
	@GetMapping()
	@RequiresPermissions("shenli:log:log")
	String Log(){
	    return "shenli/log/log";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shenli:log:log")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LogDO> logList = logService.list(query);
		int total = logService.count(query);
		PageUtils pageUtils = new PageUtils(logList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shenli:log:add")
	String add(){
	    return "shenli/log/add";
	}

	@GetMapping("/edit/{projectname}")
	@RequiresPermissions("shenli:log:edit")
	String edit(@PathVariable("projectname") String projectname,Model model){
		LogDO log = logService.get(projectname);
		model.addAttribute("log", log);
	    return "shenli/log/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shenli:log:add")
	public R save( LogDO log){
		if(logService.save(log)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shenli:log:edit")
	public R update( LogDO log){
		logService.update(log);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shenli:log:remove")
	public R remove( String projectname){
		if(logService.remove(projectname)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shenli:log:batchRemove")
	public R remove(@RequestParam("ids[]") String[] projectnames){
		logService.batchRemove(projectnames);
		return R.ok();
	}
	
}
