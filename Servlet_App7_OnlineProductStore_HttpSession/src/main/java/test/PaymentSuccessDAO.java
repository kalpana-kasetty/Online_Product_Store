package test;
import java.sql.*;
public class PaymentSuccessDAO {
 public int k=0;
 public int reupdate(ProductBean pb) { 
	 	try { 
	 	 	Connection con=DBConnection.getCon(); 
	 	 	PreparedStatement ps=con.prepareStatement("update Product54 set qty=? where code=?");  	 	ps.setInt(1, pb.getpQty());  	 	ps.setString(2,pb.getpCode());  	 	k=ps.executeUpdate(); 
	 	 	 
	 	} 
	catch(Exception e) {e.printStackTrace();} 
	 	return k; 
	} 
}
