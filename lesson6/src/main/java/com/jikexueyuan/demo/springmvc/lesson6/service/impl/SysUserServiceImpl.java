package com.jikexueyuan.demo.springmvc.lesson6.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jikexueyuan.demo.springmvc.lesson6.dao.ISysUserDao;
import com.jikexueyuan.demo.springmvc.lesson6.entity.SysUser;
import com.jikexueyuan.demo.springmvc.lesson6.service.ISysUserService;
import com.mysql.jdbc.Statement;

@Service
public class SysUserServiceImpl implements ISysUserService {

	@Resource
	ISysUserDao dao ;
	
	@Resource
	JdbcTemplate jdbcTemplate;

	@Transactional
	public void saveWithJDBC(final String uName, final int uAge) {
		final String sql = "insert into sys_user(uName, uAge) values(?,?)";
		// jdbcTemplate.update(sql, new Object[]{uName, uAge});
		
		KeyHolder key = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement statement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, uName );
				statement.setInt(2, uAge);
				return statement;
			}
		}, key);
		
		System.out.println(key.getKey().intValue());
		
	}

	@Transactional
	public void saveWithMybatis(String first_name, String last_name, String email, int address_id) {
		SysUser user = new SysUser();
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setAddress_id(address_id);
		dao.save(user);
	}

	public SysUser selectByIdWithMybatis(int customer_id) {
		return dao.selectById(customer_id);
	}

	public List<SysUser> selectAllWithMybatis() {
		return dao.selectAll();
	}

	@Transactional
	public void deleteByIdWithMybatis(int customer_id) {
		dao.deleteById(customer_id);
	}


	@Transactional
	public SysUser login(String s)
	{
		return dao.login(s);
	}
	
	
	
}
