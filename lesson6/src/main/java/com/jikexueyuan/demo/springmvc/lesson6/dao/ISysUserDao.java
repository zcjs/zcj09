package com.jikexueyuan.demo.springmvc.lesson6.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jikexueyuan.demo.springmvc.lesson6.entity.SysUser;

@Repository
public interface ISysUserDao {

	public void save(SysUser user);
	public SysUser selectById(int id );
	public void deleteById(int id);
	public List<SysUser> selectAll();
	public void modif(SysUser user);
	public SysUser login(String s);
}
