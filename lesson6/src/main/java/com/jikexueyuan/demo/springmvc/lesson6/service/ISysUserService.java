package com.jikexueyuan.demo.springmvc.lesson6.service;

import java.util.List;

import com.jikexueyuan.demo.springmvc.lesson6.entity.SysUser;

public interface ISysUserService {

	public void saveWithMybatis(String first_name, String last_name, String email, int address_id );
	public SysUser selectByIdWithMybatis(int customer_id );
	public List<SysUser> selectAllWithMybatis();
	public void deleteByIdWithMybatis(int uId );
	//public void modif(String uName, int uage );
	public SysUser login(String s);
}
