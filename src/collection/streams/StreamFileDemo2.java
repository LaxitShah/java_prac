package collection.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileDemo2 {

	public static void main(String[] args) {

		Path path = Paths.get("dictonry");
		Stream<String> lines;
		try {
			lines = Files.lines(path);
			List<String> list = lines.filter(s -> s.startsWith("d")).collect(Collectors.toList());
			list.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
