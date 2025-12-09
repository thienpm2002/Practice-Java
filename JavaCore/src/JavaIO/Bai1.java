package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai1 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Bai1.txt"));
			String s;
			int i = 1;
			while ((s = br.readLine()) != null) {
				System.out.println(i + ". " + s);
				i++;
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("An error occurred while reading the file: " + e.getMessage());
		}
	}
}
