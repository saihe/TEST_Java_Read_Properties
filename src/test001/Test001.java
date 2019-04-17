package test001;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Test001 {

	public static void main(String[] args) {
		// 起動引数１にプロパティファイルのファイルパスを指定する。
		Path propertyPath = Paths.get(args[0]);
		
		try {
			Properties properties = new Properties();
			properties.load(Files.newInputStream(propertyPath));
			print(properties.getProperty("test"));
			print(properties.getProperty("test.01"));
			print(properties.getProperty("file.name.01"));

		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	private static void print(String message) {
		System.out.println(message);
	}
	
}
