import java.sql.*;
public class First_jdbc {
	public static void main(String[] args){
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://locahost/127.0.0.1/school","root","");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		while(rs.next()) {
			final int st_id = rs.getInt("student_id");
			final String name = rs.getString("student_name");
			final String option = rs.getString("student_email");
			System.out.println(st_id+" "+name+" "+option);
		}
		
	}
}
