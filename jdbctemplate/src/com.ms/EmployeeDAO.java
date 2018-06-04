package com.ms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	
	public int savePerson(Person e){  
	    String query="insert into person values('"+e.getId()+"','"+e.getName()+"','"+e.getAge()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);
	}  
	
	public int updatePerson(Person  e)
	{  
	    String query="update person set name='"+e.getName()+"',salary='"+e.getSalary()+"',age='"+e.getAge()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deletePerson(Person  e){  
	    String query="delete from person where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}
	
	public List<Person> getAllPersonRowMapper(){  
		 return jdbcTemplate.query("select * from person",new RowMapper<Person>(){  
		    @Override  
		    public Person mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Person e=new Person();  
		        e.setId(rs.getInt(1));  
		        e.setName(rs.getString(2));
		        e.setAge(rs.getInt(3));
		        e.setSalary(rs.getInt(4));  
		        return e;  
		    }  
		    });  
}
}
