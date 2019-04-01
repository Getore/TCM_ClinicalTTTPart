package com.bootdo.image_check.controller;

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

import com.bootdo.image_check.domain.CheckErrorDO;
import com.bootdo.image_check.service.CheckErrorService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
 
@Controller
@RequestMapping("/image_check/checkError")
public class CheckErrorController {
	@Autowired
	private CheckErrorService checkErrorService;
	
	@GetMapping()
	@RequiresPermissions("image_check:checkError:checkError")
	String CheckError(){
	    return "image_check/checkError/checkError";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("image_check:checkError:checkError")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CheckErrorDO> checkErrorList = checkErrorService.list(query);
		int total = checkErrorService.count(query);
		PageUtils pageUtils = new PageUtils(checkErrorList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("image_check:checkError:add")
	String add(){
	    return "image_check/checkError/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("image_check:checkError:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		CheckErrorDO checkError = checkErrorService.get(id);
		model.addAttribute("checkError", checkError);
	    return "image_check/checkError/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("image_check:checkError:add")
	public R save( CheckErrorDO checkError){
		if(checkErrorService.save(checkError)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("image_check:checkError:edit")
	public R update( CheckErrorDO checkError){
		checkErrorService.update(checkError);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("image_check:checkError:remove")
	public R remove( Integer id){
		if(checkErrorService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("image_check:checkError:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		checkErrorService.batchRemove(ids);
		return R.ok();
	}
	
}
