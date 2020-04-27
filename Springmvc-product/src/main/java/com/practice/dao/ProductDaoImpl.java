package com.practice.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.api.Product;

public abstract class ProductDaoImpl implements ProductDao {

	private JdbcTemplate jdbcTemplate;

	public ProductDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int registerUser(Product p) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO product_info VALUES(?,?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { p.getPid(), p.getPname(), p.getPrice(), p.getFinalprice() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
