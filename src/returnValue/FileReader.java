package returnValue;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader {
	
	public void method(File file){
		
		try {
			BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
			while (reader.readLine() != null){
				String line = reader.readLine();
				System.out.println(line);
				
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
