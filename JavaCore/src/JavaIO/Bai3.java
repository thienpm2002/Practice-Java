package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bai3 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("Bai1.txt"); FileWriter wr = new FileWriter("Bai3.txt");) {
			int c;
			while ((c = fr.read()) != -1) {
				wr.write(c);
			}
			System.out.println("Copy done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
