package com.Revature.ERS;

import java.util.List;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		LoginDAO ldao = new LoginDAO();
		EmployeeDAO edao = new EmployeeDAO();
		ReimbursementDAO rdao = new ReimbursementDAO();
		Scanner sc = new Scanner(System.in);
		boolean qflag = false;
		String uname, pswd, qpromp;

		System.out.println("Enter Username --> ");
		uname = sc.nextLine();
		System.out.println("Enter Password --> ");
		pswd = sc.nextLine();

		Login test = ldao.getLogin(uname, pswd);
		if (test == null)
			System.out.println("Cannot validate login");
		else {

			while (qflag == false) {
				System.out.println(
						"1 see all employees, 2 file for reimbursement, 3 see all reimbursements, quit to quit");
				System.out.println("What do you want to do --> ");
				qpromp = sc.nextLine();

				if (qpromp.equals("1")) {
					List<Employee> ppl = edao.getALLEmployee();
					for (Employee l : ppl) {
						System.out.println(l.geteID() + " " + l.getFirst_name() + " " + l.getLast_name() + " "
								+ l.getDepartment_Num());
					}
				}

				if (qpromp.equals("2")) {
					System.out.println("Reimbursement number --> ");
					int rid = sc.nextInt();
					System.out.println("How much for the reimbursement --> ");
					double ramnt = sc.nextDouble();
					rdao.addReimbursement(rid, ramnt, test.getEID());
				}

				if (qpromp.equals("3")) {
					List<Reimbursement> rforms = rdao.getALLReimbursement();
					for (Reimbursement r : rforms) {
						System.out.println(r.getRID() + " " + r.getAmount() + " " + r.getEID());
					}
				}

				// prompt user for quitting program
				if (qpromp.equals("quit"))
					qflag = true;
				else
					qflag = false;
			}
		}
	}// end of main
}
