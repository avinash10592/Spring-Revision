package com.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.practice.api.Product;

@Component
public class ProductDaoImpl implements ProductDao {

	JdbcTemplate jdbcTemplate;

	public ProductDaoImpl() {

	}

	@Autowired
	public ProductDaoImpl(DriverManagerDataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int addProduct(Product p) {
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
