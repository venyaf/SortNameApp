/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortnameapp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author VENY
 */
public class SortNameApp {

	public static void main(String[] args) throws Exception {

		
                BufferedReader inputFile = new BufferedReader(new FileReader("E:\\unsorted-names-list.txt")); //membaca file txt
		BufferedWriter outputFile = new BufferedWriter(new FileWriter("E:\\sorted-names-list.txt")); //print ke dalam file txt
                
		String inputLine; //deklarasi baris inputan dalam bentuk String
		List<String> lineList = new ArrayList<String>(); //membuat list array untuk menampung list nama dari file txt
		while ((inputLine = inputFile.readLine()) != null) { //mengecek apakah file txt kosong dengan membaca baris dalam file
			lineList.add(inputLine); // jika tidak kosong maka melakukan perintah untuk menyimpan list nama ke arraylist
		}
		inputFile.close(); 
		Collections.sort(lineList); // sort berdasarkan alfabet dalam list nama
		PrintWriter out = new PrintWriter(outputFile); // inisiasi printWriter untuk mencetak hasil setelah dilakukan sorting
		for (String outputLine : lineList) { // menyimpan ke dalam String
			out.println(outputLine); // mencetak per baris
		}
		out.flush();
		out.close();
		outputFile.close();
      
	}
}