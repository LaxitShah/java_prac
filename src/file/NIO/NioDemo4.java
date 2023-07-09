package file.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class NioDemo4 {

	
	public static void main(String[] args) {
		
		Path path = Paths.get("D:\\www");
		try {
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			//Files.setAttribute(path, "dos:hidden", false);
			//Files.setAttribute(path, "dos:readonly", true);
			
			System.out.println(dos.isReadOnly());
			System.out.println(dos.isHidden());
			System.out.println(dos.isDirectory()); 
			
			
			System.out.println("donee....");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
