package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import bean.AdminBean;
import dao.AdminDao;

public class AdminController {

	static ArrayList<AdminBean> admins = new ArrayList<>();
	static AdminBean adminBean = null;

	public static void main(String[] args) {

		AdminDao adminDao = new AdminDao();
		int choice = 0;

		do {
			System.out.println("pls enter your choice :-");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter 1 for add Admin");
			System.out.println("enter 2 for view admins");
			System.out.println("enter 3 for delete Admin By name");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				adminDao.addAdmin();
				break;// case 1 over....

			case 2:
				admins = adminDao.viewAdmins();
				for (int i = 0; i < admins.size(); i++) {

					AdminBean adminBean = admins.get(i);
					System.out.println();
					System.out.print(adminBean.getaId());
					System.out.print("   " + adminBean.getaName());
					System.out.print("   " + adminBean.getaEmail());
					System.out.println();

				}

				break; // case 2 over...

			case 3:

				admins = adminDao.viewAdmins();
				for (int i = 0; i < admins.size(); i++) {

					adminBean = admins.get(i);
					System.out.println();
					System.out.print(adminBean.getaId());
					System.out.print("   " + adminBean.getaName());
					System.out.print("   " + adminBean.getaEmail());
					System.out.println();

				}

				System.out.println("enter admin name");
				String aName = sc.next();

				for (int i = 0; i < admins.size(); i++) {

					adminBean = admins.get(i);
					System.out.print("   " + adminBean.getaName());

					System.out.println(i + "--->" + aName.equals(adminBean.getaName()));
					if (aName.equals(adminBean.getaName())) {
						admins.remove(i);
						// updated admin....
					/*	admins.set(i, adminBean);*/

					} // if over..

				} // loop...

				break;// case 3 over...

			}// switch over...
		} while (choice != 5);
	}
}
