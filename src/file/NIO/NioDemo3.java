package file.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class NioDemo3 {

	
	
	
	public static void main(String[] args) {

		Path path = Paths.get("D:\\dos.txt");

		try {
			BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

			
		
		
			//FileTime fileTime = basicFileAttributes.creationTime();
			FileTime fileTime = basicFileAttributes.lastModifiedTime();
			System.out.println(fileTime);

			// simple date formate class

			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/YYYY/dd hh:mm:ss");
			System.out.println(simpleDateFormat.format(fileTime.toMillis()));
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
