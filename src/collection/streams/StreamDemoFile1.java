package collection.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemoFile1 {

	public static void main(String[] args) {

		Path path = Paths.get("abcd123.txt");
		
		try {
			Stream<String> lines = Files.lines(path);
			//System.out.println(lines.count());
			lines.forEach(System.out::println);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
