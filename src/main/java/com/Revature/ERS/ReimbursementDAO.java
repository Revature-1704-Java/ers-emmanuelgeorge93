package com.Revature.ERS;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Revature.ERS.ConnectionUtil;

public class ReimbursementDAO {

	public List<Reimbursement> getALLReimbursement() {
		PreparedStatement ps = null;
		Reimbursement cash = null;
		List<Reimbursement> cashs = new ArrayList<>();

		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM REIMBURSEMENT";
			ps = conn.prepareStatement(sql);
			// Add any variables to PS
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int rid = rs.getInt("Rid");
				double amnt = rs.getDouble("Amount");
				int eid = rs.getInt("Eid");

				cash = new Reimbursement(amnt, rid, eid);
				cashs.add(cash);
			}
			rs.close();
			ps.close();
		} catch (Exception ex) {
			ex.getMessage();
		}

		return cashs;
	}// end of get all employees

	public Reimbursement getReimbursement(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Reimbursement cash = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "SELECT * FROM REIMBURSEMENT WHERE Rid = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			rs = ps.executeQuery();
			while (rs.next()) {
				int rid = rs.getInt("Rid");
				double amnt = rs.getDouble("Amount");
				int eid = rs.getInt("Eid");

				cash = new Reimbursement(amnt, rid, eid);
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
		return cash;
	} // end of get Employee

	public Reimbursement addReimbursement(int rid, double amnt, int eid) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Reimbursement cash = null;
		try (Connection conn = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO REIMBURSEMENT VALUES (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rid);
			ps.setDouble(2, amnt);
			ps.setInt(3, eid);

			rs = ps.executeQuery();
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
		return cash;
	} // end of get Employee

}
