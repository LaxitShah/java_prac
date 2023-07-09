package project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import project.bean.AdminBean;

public class AdminController {

	public static void main(String[] args) {

		int choice = 0;
		ArrayList<AdminBean> admins = new ArrayList<>();
		AdminBean adminBean = null;

		do {

			System.out.println("pls enter your choice :-");
			System.out.println("enter 1 for add Data:-");
			System.out.println("enter 2 for delete Data:-");
			System.out.println("enter 3 for view Data:-");
			System.out.println("enter 4 for update Data:-");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter adminId:-");
				int aId = sc.nextInt();
				System.out.println("enter adminName:-");
				String aName = sc.next();
				System.out.println("enter admin email");
				String aEmail = sc.next();

				adminBean = new AdminBean();

				adminBean.setaId(aId);
				adminBean.setaName(aName);
				adminBean.setaEmail(aEmail);

				admins.add(adminBean);
				// arraylist 0 th 1 record
				// aadmin 2nd 1

				break;

			case 2:

				// method...

				for (int i = 0; i < admins.size(); i++) {

					// System.out.println(admins.get(i).getaName());

					adminBean = admins.get(i);// 101 id

					// System.out.println("**"+admins.get(i));

					System.out.print("  " + adminBean.getaId());
					System.out.print("  " + adminBean.getaName());
					System.out.print("  " + adminBean.getaEmail());
					System.out.println();
				}
				System.out.println("enter index to delete...");
				int index = sc.nextInt();

				admins.remove(index);

				// dao list method...

				for (int i = 0; i < admins.size(); i++) {

					// System.out.println(admins.get(i).getaName());

					adminBean = admins.get(i);// 101 id

					// System.out.println("**"+admins.get(i));

					System.out.print("  " + adminBean.getaId());
					System.out.print("  " + adminBean.getaName());
					System.out.print("  " + adminBean.getaEmail());
					System.out.println();
				}

				break;

			case 3:

				System.out.println("ADMIN DATA:-");

				for (int i = 0; i < admins.size(); i++) {

					// System.out.println(admins.get(i).getaName());

					adminBean = admins.get(i);// 101 id

					// System.out.println("**"+admins.get(i));

					System.out.print("  " + adminBean.getaId());
					System.out.print("  " + adminBean.getaName());
					System.out.print("  " + adminBean.getaEmail());
					System.out.println();
				}
				break;

			case 4:
				System.out.println("update Mode..");
				for (int i = 0; i < admins.size(); i++) {

					// System.out.println(admins.get(i).getaName());

					adminBean = admins.get(i);// 101 id

					// System.out.println("**"+admins.get(i));

					System.out.print("  " + adminBean.getaId());
					System.out.print("  " + adminBean.getaName());
					System.out.print("  " + adminBean.getaEmail());
					System.out.println();
				}

				System.out.println("pls enter index to update...");
				index = sc.nextInt();
				System.out.println("pls enter admin id to update..");
				aId = sc.nextInt();
				System.out.println("pls enter admin Name to update..");
				aName = sc.next();
				System.out.println("pls enter email id to update..");
				aEmail = sc.next();

				adminBean = new AdminBean();

				adminBean.setaId(aId);
				adminBean.setaName(aName);
				adminBean.setaEmail(aEmail);

				admins.set(index, adminBean); // updated object...
				System.out.println("record updated...");

				break;

			case 5:
				
				adminBean = new AdminBean();
				System.out.println("DELETE WITH NAME..");
				for (int i = 0; i < admins.size(); i++) {

					// System.out.println(admins.get(i).getaName());

					adminBean = admins.get(i);// 101 id

					// System.out.println("**"+admins.get(i));

					System.out.print("  " + adminBean.getaId());
					System.out.print("  " + adminBean.getaName());
					System.out.print("  " + adminBean.getaEmail());
					System.out.println();
				}

				System.out.println("pls enter admin Name to delete...");
				aName = sc.next();
				adminBean.setaName(aName);
				
				/*ArrayList<String >al = new ArrayList<>();
				// samir
				// raj
				
				al.contains("samir");
				*/// deven 1
				// poojan 2

				System.out.println(admins.contains(adminBean));

				if (admins.contains(adminBean)) {

					System.out.println("true...");
					index = admins.indexOf(adminBean);

					admins.remove(index);
					System.out.println(aName + " removed successfully...");

				} else {

					System.out.println(aName + "not found...");
				}

				break;

			}// switch over....

		} while (choice != 6);// while over....
	}

}
