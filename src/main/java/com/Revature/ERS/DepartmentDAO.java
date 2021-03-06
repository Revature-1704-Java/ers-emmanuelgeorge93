package com.Revature.ERS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Revature.ERS.ConnectionUtil;

public class DepartmentDAO {

	public List<Department> getALLDepartment() {
		PreparedStatement ps = null;
		Department room = null;
		List<Department> rooms = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM DEPARTMENT";
			ps = conn.prepareStatement(sql);
			// Add any variables to PS
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int did = rs.getInt("Did");
				String dname = rs.getString("Department_name");

				room = new Department(dname, did);
				rooms.add(room);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.getMessage();
		}

		return rooms;
	}// end of get all employees

	public Department getDepartment(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Department room = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM DEPARTMENT WHERE Did = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {
				int did = rs.getInt("Did");
				String dname = rs.getString("Department_name");

				room = new Department(dname, did);
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
		return room;
	} // end of get Employee

}
