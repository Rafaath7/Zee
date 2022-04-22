package friday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Bankproject {

	Connection con = null;
	public String pass;

	public static void main(String[] args) throws SQLException {

		while (true) {

			System.out.println("Hi, Click L to login and R to register");
			Scanner sc = new Scanner(System.in);
			String ch = sc.next();
			Bankproject a = new Bankproject();
			if (ch == "L") {
//			System.out.println("enter firstname ");
//			String fname= sc.next();
//			System.out.println("enter password");
//			try {
//				pass= sc.next();
//			} catch (Exception e) {
//				
//				e.printStackTrace();
//			}
				a.login();
			} else if (ch == "R") {

				a.register();
			} else {
				System.out.println("Invalid Choice");
			}
		}
	}

	public void register() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("enter account number");
		int acc = sc.nextInt();
		System.out.println("enter firstname ");
		String fname = sc.next();
		System.out.println("enter Lastname");
		String lname = sc.next();
		System.out.println("enter Password");
		pass = sc.next();
		System.out.println("enter Phone number");
		int ph = sc.nextInt();
		System.out.println("enter ifsc");
		int ifsc = sc.nextInt();
		System.out.println("enter money to deposit- Balance");
		int bal = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wednesday", "root", "Pass@123");
			PreparedStatement ps = con.prepareStatement("insert into bank3 values(?,?,?,?,?,?)");

			ps.setInt(1, acc);
			ps.setString(2, fname);
			ps.setString(3, lname);
			ps.setString(4, pass);
			ps.setInt(5, ph);
			ps.setInt(6, ifsc);
			ps.setInt(7, bal);

			ps.execute();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void login() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!");

		System.out.println("enter firstname ");
		String fname = sc.next();

		System.out.println("enter Password");
		pass = sc.next();

		Statement stmt = con.createStatement();
	
		PreparedStatement ps2 = con.prepareStatement("select * from bank3 where Fname=? and pass=? ");
		
		ps2.setString(1, fname);
		ps2.setString(2, pass);
		
		ResultSet rs=ps2.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " :" + rs.getString(2) + " :" + rs.getString(3) + " :" + rs.getInt(5) + ":"
					+ rs.getInt(6) + " :" + rs.getInt(7));
		}
	}
}
