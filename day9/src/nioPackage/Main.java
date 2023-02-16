package nioPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Path path=Paths.get("MyNewFolder\\a.txt");
			System.out.println(Files.exists(path));
			
			if(!Files.exists(path)) 
				Files.createFile(path);
			
			System.out.println(Files.exists(path));
			
			byte bytes[] = "this just come content".getBytes();
			Files.write(path, bytes);
			
			List<String> content = Files.readAllLines(path);
			content.forEach(s->System.out.println(s));
	}

}
