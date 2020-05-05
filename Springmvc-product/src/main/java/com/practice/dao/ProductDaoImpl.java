package com.practice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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

				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setFinalprice(rs.getDouble(4));

				return product;
			}

		});
	}

//	public int saveOrUpdate(Product p) {
//		if (p.getPid() > 0) {
//	        // update
//	        String sql = "UPDATE product SET pname=?, price=?, finalprice=?, "
//	                   + "WHERE pid=?";
//	        jdbcTemplate.update(sql, p.getPname(), p.getPrice(),
//	                p.getFinalprice(), p.getPid());
//	    } else {
//	        // insert
//	        String sql = "INSERT INTO contact (pname, price, finalprice)"
//	                    + " VALUES (?, ?, ?)";
//	        jdbcTemplate.update(sql, p.getPname(), p.getPrice(),
//	                p.getFinalprice());
//	        return jdbcTemplate.update(sql);
//	    }
//		return jdbcTemplate.insert(sql);;
//	}

	@Override
	public int editProduct(Product p) {
		// TODO Auto-generated method stub
//		String sql = "update product_info set pname=" + p.getPname() + ", price=" + p.getPrice() + ",finalprice="
//				+ p.getFinalprice() + " where pid=" + p.getPid() + "";
		String sql = "update product_info set pname='" + p.getPname() + "', price='" + p.getPrice() + "',finalprice='"
				+ p.getFinalprice() + "' where pid=" + p.getPid() + "";
		return jdbcTemplate.update(sql);

	}

	@Override
	public Product getProductById(int pid) {
		String sql = "select * from product_info where pid=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { pid },
				new BeanPropertyRowMapper<Product>(Product.class));

	}

	@Override
	public int deleteProduct(int pid) {

		String sql = "delete from product_info where pid=" + pid + "";
		return jdbcTemplate.update(sql);
	}
}
