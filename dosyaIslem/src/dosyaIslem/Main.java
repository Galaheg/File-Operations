package dosyaIslem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// createFile();
		// getFileInfo();
		// read2();
		readFile();
		writeFile();
		readFile();
	}

	public static void createFile() {
		File file = new File("C:\\Users\\HemEv\\Desktop\\Java\\Eclipse\\folders\\emre.txt");
		try {
			if (file.createNewFile())
				System.out.println("Olustu");
			else
				System.out.println("Zaten var");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {// dosyan�n daha �nceden olu�turulmu� olmas� laz�m
		File file = new File("C:\\Users\\HemEv\\Desktop\\Java\\Eclipse\\folders\\emre.txt");
		if (file.exists()) {
			System.out.println("Dosya ad�: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
			System.out.println("Dosyaya yaz�labilir mi? " + file.canWrite()); 
			System.out.println("Dosyaya okunabilir mi? " + file.canRead());
			System.out.println("Dosya boyutu " + file.length());
		}

	}

	public static void readFile() {
		File file = new File("C:\\Users\\HemEv\\Desktop\\Java\\Eclipse\\folders\\emre.txt");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void read2() {
		BufferedReader read = null;

		try {
			read = new BufferedReader(new FileReader("C:\\Users\\HemEv\\Desktop\\Java\\Eclipse\\folders\\emre.txt"));
			String line;
			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void writeFile() {

		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\HemEv\\Desktop\\Java\\Eclipse\\folders\\emre.txt", true));// false veya
																											// bir �ey
																											// yazmazsak
																											// i�eri�i
																											// siler ve
																											// �yle
																											// yazar
																											// dosyaya
			writer.newLine();// yanyana yazmamas� i�in
			writer.write("ZAAXD");
			System.out.println("Yaz�ld� dosyaya");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
