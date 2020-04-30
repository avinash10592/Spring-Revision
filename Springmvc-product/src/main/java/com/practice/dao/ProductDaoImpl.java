package com.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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

	@Override
	public List<Product> getProducts() {
		return jdbcTemplate.query("select * from product_info", new RowMapper<Product>() {
			
			
			
			public Product mapRow(ResultSet rs, int row) throws SQLException {
				Product product = new Product();
				
				product.setPid(rs.getString(1));
				product.setPname(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setFinalprice(rs.getDouble(4));
				

				return product;
			}

			
		});
	}
}
