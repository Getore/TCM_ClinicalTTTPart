package com.bootdo.staff.controller;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.staff.domain.StaffExcelExport;
import com.bootdo.staff.utils.ExcelExportUtils;
import com.xuxueli.poi.excel.ExcelExportUtil;
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

import com.bootdo.staff.domain.StaffDO;
import com.bootdo.staff.service.StaffService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-28 09:56:21
 */
 
@Controller
@RequestMapping("/staff/staff")
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	@GetMapping()
	@RequiresPermissions("staff:staff:staff")
	String Staff(){
	    return "staff/staff/staff";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("staff:staff:staff")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StaffDO> staffList = staffService.list(query);
		int total = staffService.count(query);
		PageUtils pageUtils = new PageUtils(staffList, total);
		return pageUtils;
	}

	/**
	 * excel文件导出
	 *
	 * @param params
	 * @return
	 */
	@ResponseBody
	@GetMapping("/excelList")
	@RequiresPermissions("staff:staff:excelList")
	public PageUtils excelList(@RequestParam Map<String, Object> params){
		// 查询列表数据
		Query query = new Query(params);
		List<StaffExcelExport> staffExcelExportList = staffService.excelList(query);
		int total = staffService.count(query);
		PageUtils pageUtils = new PageUtils(staffExcelExportList, total);
		return pageUtils;
	}

	
	@GetMapping("/add")
	@RequiresPermissions("staff:staff:add")
	String add(){
	    return "staff/staff/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("staff:staff:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		StaffDO staff = staffService.get(id);
		model.addAttribute("staff", staff);
	    return "staff/staff/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("staff:staff:add")
	public R save( StaffDO staff){
		if(staffService.save(staff)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("staff:staff:edit")
	public R update( StaffDO staff){
		staffService.update(staff);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("staff:staff:remove")
	public R remove( Integer id){
		if(staffService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("staff:staff:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		staffService.batchRemove(ids);
		return R.ok();
	}

	/**
	 * 导出 excel 文件
	 *
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/exportExcel")
    public void exportExcel(HttpServletResponse response/*, @RequestParam("lrsjEnd") String lrsjEnd, @RequestParam("lrsj") String lrsj*/) throws Exception{
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String fileName = "员工日志表" + format.format(new Date().getTime()) + ".xls";
        response.setContentType("application/ms-excel;charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment;fileanme=" + new String(fileName.getBytes(), "iso-8859-1"));

        OutputStream outputStream = response.getOutputStream();
        Map map = new HashMap();

        try {
            List<StaffExcelExport> excelList = staffService.excelList(map);
			ExcelExportUtils.exportToFile(excelList, outputStream);
        } catch (Exception e){
        	System.out.println("未找到文件，可能去火星了！");
//        	throw new Exception("文件去火星了！");
        } finally {
        	outputStream.close();
        }
    }
	
}
