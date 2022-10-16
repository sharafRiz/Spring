package org.simplilearn.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.simplilearn.app.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class EmpDaoImpl implements EmDao {
 private JdbcTemplate template;
 
 
	@Autowired
	public EmpDaoImpl(JdbcTemplate template) {
	super();
	this.template = template;
}
    
	public void insert(final Emp e) {
		
	//template.update("insert into emo values()?,?,?", e.getEno(),e.getName(),e.getAddress());
		template.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
			
					 PreparedStatement pst =con.prepareStatement("insert into emp values(?,?,?");
					 pst.setInt(1, e.getEno());
					 pst.setString(2, e.getName());
					 pst.setString(3, e.getAddress());
					return pst;
			}
		});
		
		}


	public void delete(int eno) {
		template.update("delete from emp where eno=?", eno);
		
	}
  
	public List<Emp> getAll() {
		
		return template.query("select * from emp", new RowMapper() {
            
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
				Emp e =new Emp();
				e.setEno(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAddress(rs.getNString(3));
				return e;
			}
		});
	}

	public Optional<Emp> get(int eno) {
		
		return null;
	}

}
