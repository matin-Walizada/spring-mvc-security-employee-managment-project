package com.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.employee.model.Admin_Registeration_Model;

@Repository
public class Admin_Registeration_Dao {
	
	
	// need to inject the jdbc template
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Admin_Registeration_Model  model) {
	
		String sql = "insert into users(first_Name, last_Name,username, password, phone,email, date_reg,enabled) values(?,?,?,?,?,?,?,?)";
		
		Object[] data = {
				
				model.getFirst_Name(),
				model.getLast_Name(),
				model.getUser_Name(),
				model.getPassword(),
				model.getPhone(),
				model.getEmail(),
				model.getDate_reg(),
				model.getEnabled()
				
		};
		
		
		jdbcTemplate.update(sql, data);
		
	}
	

	
	
	
	
	
	
}
