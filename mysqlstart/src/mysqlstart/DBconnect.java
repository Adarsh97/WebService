package mysqlstart;

import java.sql.*;

public class DBconnect {

	private Connection con;
	private Statement st;
	private ResultSet rt;
	
	public DBconnect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		    st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		}
		catch(Exception ex)
		{
			System.out.println("error"+ ex);
		}
	}
	public void getData() throws SQLException
	{
		try
		{
			rt=st.executeQuery("select id,name,age,salary from person");
			rt.moveToInsertRow();
			rt.updateInt("id", 90);
			rt.updateString("name","anil");
			rt.updateInt("age", 57);
			rt.updateInt("salary", 900);
			rt.insertRow();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}	
		/*     
			 * String query="select * from person";
			rt=st.executeQuery(query);
			rt.last();
			System.out.println(rt.getRow());
			
			while(rt.next())
			{
				String name=rt.getString("name");
				String age=rt.getString("age");
				System.out.println(name+" "+age);
				
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			rt.close();
			st.close();
			con.close();
		}
	}
	*/
}
