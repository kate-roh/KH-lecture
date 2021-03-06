package com.model.biz;

import java.sql.Connection;
import java.util.List;

import com.model.dao.ProductDao;
import com.model.dto.Product;

public class ProudctBiz {
	ProductDao dao = new ProductDao();
	
	public List<Product> selectAll() {
		Connection con = getConnection();
		List<Product>res = dao.selectAll(con);
		close(con);
		return res;
	}
	public Product selectOne(String p_name) {
		Connection con = getConnection();
		Product dto = dao.selectOne(con, p_name);
		close(con);
		
		return dto;
	}
	public int insert(Product dto) {
		Connection con = getConnection();
		int res = dao.insert(con,dto);
		if(res>0) {    /
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}
	public int update(Product dto) {
		Connection con = getConnection();
		int res = dao.update(con, dto);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}
	public int delete(String product_id) {
		Connetion con = getConnetion();
		int res = dao.delete(con, product_id);
		if(res>0) {
			commit(con);
		}else {
			rollback(con);
		}
		close(con);
		return res;
	}
	
	
	
	
	
	
}
