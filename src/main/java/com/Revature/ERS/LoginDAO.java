package com.Revature.ERS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Revature.ERS.ConnectionUtil;

public class LoginDAO {

	public List<Login> getALLLogin() {
		PreparedStatement ps = null;
		Login code = null;
		List<Login> codes = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM Login";
			ps = conn.prepareStatement(sql);
			// Add any variables to PS
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int lid = rs.getInt("Lid");
				String uname = rs.getString("Username");
				String pswd = rs.getString("passwordin");
				int eid = rs.getInt("Eid");

				code = new Login(uname, pswd, lid, eid);
				codes.add(code);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return codes;
	}// end of get all employees

	// find a user with username and password, allow a user to login if they have
	// the right codes
	public Login getLogin(String usert, String pswdt) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Login code = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM LOGIN WHERE Username = ? and passwordin = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, usert);
			ps.setString(2, pswdt);

			rs = ps.executeQuery();
			while (rs.next()) {
				int lid = rs.getInt("Lid");
				String uname = rs.getString("Username");
				String pswd = rs.getString("passwordin");
				int eid = rs.getInt("Eid");

				code = new Login(uname, pswd, lid, eid);
				if (code.equals(null))
					System.out.println("Account not found");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return code;
	} // end of get Employee

}