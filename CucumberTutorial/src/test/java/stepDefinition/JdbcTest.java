package stepDefinition;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String args[]){
	
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String serverURL="jdbc:mysql://localhost:3306/mydb";
		String userName="root";
		String password="root123";
		Connection con=DriverManager.getConnection(serverURL, userName, password);
		
		Statement st=con.createStatement();
	
		ResultSet rs=st.executeQuery("select * from orders");
		
		while(rs.next()){
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}
		
		/*st=con.createStatement();
		int status=st.executeUpdate("insert into orders values('1','V','Giri','Tambaram','Chennai')");
		System.out.println(status+" Record(s) inserted");*/
		
		/*st=con.createStatement();
		int status=st.executeUpdate("delete from orders where FirstName");
		System.out.println(status+" Record(s) Deleted");*/
		
		st=con.createStatement();
		int status=st.executeUpdate("update orders set shippers='sakthi' where email='san@gmail.com'");
		System.out.println(status+" Record(s) Updated");
		
		/*PreparedStatement pt=con.prepareStatement("insert into orders(personID,LastName,FirstName,Address,City) values(?,?,?,?,?)");
		
		pt.setString(1, "2");
		pt.setString(2, "Sankar");
		pt.setString(3, "Santhosh");
		pt.setString(4, "Kunnagampoondi");
		pt.setString(5, "Vandavasi");
		
		pt.addBatch();
		
		pt.setString(1, "3");
		pt.setString(2, "Kumaran");
		pt.setString(3, "Vasanth");
		pt.setString(4, "Nagaram");
		pt.setString(5, "Arni");
		
		pt.addBatch();
		
		int[] status=pt.executeBatch();
		System.out.println(status.length+" Record(s) Added");
		
		pt.close();
		
		pt.setString(1, "4");
		pt.setString(2, "Arumugam");
		pt.setString(3, "Sankar");
		pt.setString(4, "Kunnagampoondi");
		pt.setString(5, "Vandavasi");
		int status1=pt.executeUpdate();
		System.out.println(status1+" Record(s) Added");*/
		
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
	}
}


