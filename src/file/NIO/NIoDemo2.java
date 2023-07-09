package file.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NIoDemo2 {

	public static void main(String[] args) {

		System.out.println("pls enter your choice :-");
		System.out.println("press 1 for create file..");
		System.out.println("press 2 for create folder");
		System.out.println("press 3 for delete file..");
		System.out.println("press 5 for move file..");
		System.out.println("press 4 for copy file..");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {

		case 1:

			System.out.println("pls enter file name to create without txt*");
			String fname = sc.next();
			fname = fname.concat(".txt");
			Path p1 = Paths.get(fname);
			// exist check
			if (Files.exists(p1)) {

				System.out.println("file already exist..");
			} else {

				try {
					Files.createFile(p1);
					System.out.println("file created :" + fname);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			break; // case 1 over...

		case 2:
			// mkdir // mkdirs
			String folName = sc.next();
			Path p2 = Paths.get(folName);
			// check exist...//cretae more thn 1...
			// Files.createDirectories(p2); ->hw
			try {
				Files.createDirectory(p2);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break; // case 2 over...

		case 3:
			System.out.println("pls enter file name to delete...");
			String dfname = sc.next();
			Path p3 = Paths.get(dfname);
			if (Files.exists(p3)) {

				try {
					Files.delete(p3);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("no such fie found....");
			}

			break;// case 3....

		case 4:
			System.out.println("enter file name to copy..");
			String copyFile = sc.next();

			Path source = Paths.get(copyFile);
			Path dest = Paths.get("python//" + copyFile);

			if (Files.exists(source)) {

				// check folder if exist...

				try {
					Files.copy(source, dest);
					System.out.println("file copied...");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {

				System.out.println("such file not exist..");
			}

			break;// case 4 over..

		case 5:
			System.out.println("enter file name to move...");
			String mFname = sc.next();
			Path source1 = Paths.get(mFname);
			Path dest1 = Paths.get("D://" + mFname);
			if (Files.exists(source1)) {

				try {
					Files.move(source1, dest1);
					System.out.println("file moved..to path:" + dest1);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {

				System.out.println("no file exist with name" + mFname);
			}

			break;// case 5 over...

		}// switch over...

	}
}
