package com.Revature.ERS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Revature.ERS.ConnectionUtil;

public class EmployeeDAO {

	public List<Employee> getALLEmployee() {
		PreparedStatement ps = null;
		Employee dude = null;
		List<Employee> dudes = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM EMPLOYEE";
			ps = conn.prepareStatement(sql);
			// Add any variables to PS
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int eid = rs.getInt("Eid");
				String fname = rs.getString("Firstname");
				String lname = rs.getString("Lastname");
				int did = rs.getInt("Did");

				dude = new Employee(fname, lname, did, eid);
				dudes.add(dude);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.getMessage();
		}

		return dudes;
	}// end of get all employees

	public Employee getEmployee(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Employee dude = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM EMPLOYEE WHERE Eid = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {
				int eid = rs.getInt("Eid");
				String fname = rs.getString("Firstname");
				String lname = rs.getString("Lastname");
				int did = rs.getInt("Did");

				dude = new Employee(fname, lname, did, eid);
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
		return dude;
	} // end of get Employee

}
