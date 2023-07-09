package file.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo1 {

	public static void main(String[] args) {

		Path path = Paths.get("niofile1.txt"); // url //uri
		// Paths p1 = new Paths();//private //singleton design pattern
		try {
			Files.createFile(path);
			System.out.println("file created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
