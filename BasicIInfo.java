
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;


public class BasicIInfo {
	String sql=null;

	public void BasicMethod(String name, String email, String education, String experience, String skill){
		
		
		
			sql = "insert into RoboResume(UsernName, email, education, experience, skills)values(?,?,?,?,?)";

			System.out.println(sql);
		
		
		
		

		Connection con = null;
		
		
		
		//ResultSet rs = null;
		PreparedStatement pstmt=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/RobotResume?"+ "user=root&password=password");
            pstmt = con.prepareStatement(sql);
                		
            
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, education );
            pstmt.setString(4, experience);
            pstmt.setString(5, skill);
            
            pstmt.executeUpdate();
            }
            
		/*
		while(rs.next()){
			System.out.print(rs.getString("FirstName") + "\t");
			System.out.print(rs.getString("LastName"));
			System.out.println();
		}
		*/
		catch (SQLException e){

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//rs.close();
				pstmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
}
