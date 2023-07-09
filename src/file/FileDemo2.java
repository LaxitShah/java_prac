package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) {

		System.out.println("pls enter your choice:");
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter 1 of create new file..");
		System.out.println("pls enter 2 for delete file.");
		System.out.println("pls enter 3 for create folder .");
		System.out.println("pls enter 4 for read only file.");
		System.out.println("pls enter folder name to create...");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.println("pls entre file name to create new file...without .txt");
			String fname = sc.next();
			fname = fname.concat(".txt");
			File file = new File(fname);
			if (file.exists()) {

				System.out.println("file is already exists try again...");
			} else {

				try {
					if (file.createNewFile()) {

						System.out.println("file creeated syccessfully..");
					} else {
						System.out.println("file not  creeated..");
					}
				} catch (IOException e) {

					e.printStackTrace();
				}

			}
			break;
		case 2:
			System.out.println("pls entre file name to delete file...without .txt");
			String dname = sc.next();
			dname = dname.concat(".txt");
			file = new File(dname);

			if (file.exists()) {

				file.delete();
				System.out.println("deleted..");
			} else {

				System.out.println("no file exist with name  " + dname);
			}

			break;

		case 3:
			System.out.println("pls enter folder name to create..");
			String fName = sc.next();
			file = new File("D:\\2020corona\\" + fName);
			file.mkdir();
			System.out.println("folder created.." + fName);
			break;

		case 4:
			System.out.println("pls entre file name to create new file...without .txt");
			String fname1 = sc.next();
			fname1 = fname1.concat(".txt");
			file = new File(fname1);
			if (file.exists()) {

				System.out.println("file is already exists try again...");
			} else {

				try {
					if (file.createNewFile()) {

						System.out.println("file creeated syccessfully..");
						file.setReadOnly();
						System.out.println("prop changed...");
					} else {
						System.out.println("file not  creeated..");
					}
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

			break;

		case 5:
			File file2 = new File("a\\b\\c\\d");
			file2.mkdirs();
			break;

		} // switch casse

	}

}
