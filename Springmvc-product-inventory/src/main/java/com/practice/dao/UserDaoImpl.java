package com.practice.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.api.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int registerUser(User user) {
		String sql = "INSERT INTO userdetails_product VALUES(?,?)";

		try {

			int counter = jdbcTemplate.update(sql, new Object[] { user.getUserId(), user.getPassword() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String loginUser(User user) {
		String sql = "SELECT userId FROM userdetails_product WHERE userId=? AND password=?";

		try {

			String userId = jdbcTemplate.queryForObject(sql, new Object[] { user.getUserId(), user.getPassword() },
					String.class);

			return userId;

		} catch (Exception e) {
			return null;
		}
	}
}
