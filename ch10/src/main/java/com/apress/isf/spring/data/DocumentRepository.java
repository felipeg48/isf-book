/**
 * 
 */
package com.apress.isf.spring.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apress.isf.java.model.Document;

/**
 * @author Felipe Gutierrez
 *
 */
@Repository("documentDAO")
public class DocumentRepository implements DocumentDAO {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private String query;
	
	public List<Document> getAll() {
		this.jdbcTemplate = new JdbcTemplate(this.dataSource);
		return jdbcTemplate.query(query, new DocumentRowMapper());
	}

}
