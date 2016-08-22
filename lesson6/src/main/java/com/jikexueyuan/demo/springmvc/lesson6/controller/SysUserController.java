package com.jikexueyuan.demo.springmvc.lesson6.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jikexueyuan.demo.springmvc.lesson6.entity.SysUser;
import com.jikexueyuan.demo.springmvc.lesson6.service.ISysUserService;

@Controller
public class SysUserController {

	@Resource
	ISysUserService service;



	
	
	// -------------------------
	
	@RequestMapping("/all2")
	@ResponseBody
	public List<SysUser> mybatisselectAll()
	{
		List<SysUser> list = new ArrayList<SysUser>(); 
		list = service.selectAllWithMybatis();
		return list;
	}
	
	
	/*public String mybatisselectAll(HttpServletRequest request){
		List<SysUser> userList = service.selectAllWithMybatis();
		request.setAttribute("listUser", userList);
		return "all";
	}*/
	
	@RequestMapping("/select/{id}")
	public void mybatisselect(@PathVariable Integer id){
		SysUser user = service.selectByIdWithMybatis(id);
		if (user != null) {
			System.out.println(user.toString());
		}else {
			System.out.println("not found ");
		}
	}	
	
	@RequestMapping("/delete/{id}")
	public String mybatisdelete(@PathVariable Integer id){
		service.deleteByIdWithMybatis(id);
		System.out.println("jdbc delete success");
		return "redirect:/all";
	}	
	
	@RequestMapping("/save")
	public String mybatissave(HttpServletRequest request){
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		int address_id = Integer.parseInt(request.getParameter("address_id"));
		 service.saveWithMybatis(first_name, last_name,email,address_id);
		System.out.println("jdbc save success");
		return "redirect:/all";
	}	
	@RequestMapping("/login")
	public String login(String uname)
	{	
		SysUser su =service.login(uname);
		if(su != null)
		{
			return "all";
		}
		return "asd";
	}
	
}
