package logFile;

import java.io.File;

import java.io.IOException;

import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class logFileExample {
	public static void main(String[] args) throws IOException
	{
	
		File userActivityFile = new File("C://Users//DELL//Music//Desktop/abc.log");
		Files.lines(userActivityFile.toPath()).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		
		
		List<String> filteredLines = Files.lines(userActivityFile.toPath()).filter(line->line.endsWith("Login")).
		          collect(Collectors.toList());
		//filteredLines.stream().collect(Collectors.groupingBy(f->f.substring(0,14)).toList();
		System.out.println(filteredLines.stream().count());
		//System.out.println(filteredLines);
	}
}
