package dao;

import java.util.ArrayList;
import java.util.Scanner;

import bean.AdminBean;

public class AdminDao {

	ArrayList<AdminBean> al = new ArrayList<>();

	public void addAdmin() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Add admin Module...");
		System.out.println("pls enter adminId");
		int aId = sc.nextInt();
		System.out.println("pls enter adminName");
		String aName = sc.next();
		System.out.println("pls enter admin Email");
		String aEmail = sc.next();

		AdminBean adminBean = new AdminBean();
		adminBean.setaId(aId);
		adminBean.setaName(aName);
		adminBean.setaEmail(aEmail);

		al.add(adminBean);
	}

	public ArrayList<AdminBean> viewAdmins() {

		return al;

	}

	public void deleteAdmin(AdminBean adminBean) {

		
		System.out.println(al.contains(adminBean));

	}

}
