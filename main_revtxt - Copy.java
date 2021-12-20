package reversetxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class main_revtxt {
//Creare un file.txt che stampi all'interno il contenuto di nomi_italiani.txt al contrario
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String myFile=""; //insert here the path to nomi_italiani.txt
		//Scrittura
		try {
            File file = new File(myFile);
            FileReader fr=new FileReader(file); 
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String fileContent = "";
            while((fileContent=br.readLine())!=null) {  
            	list.add(fileContent);	}
        }catch(IOException e) {
        	System.out.println("\nFile non trovato: \n"+e.getStackTrace());
        }
		
		Collections.reverse(list); //inverto la lista
		//Lettura
		myFile="...\\nomi_reversed.txt"; //insert here the path where you want to save the reversed file 
		try {
            File file = new File(myFile);
    		file.createNewFile();
            FileWriter fw=new FileWriter(file); 
            BufferedWriter bw=new BufferedWriter(fw);  
            
            for(String l: list) {
                bw.write(l+"\n");
                bw.flush();
            }
        }catch(IOException e) {
        	System.out.println("\nFile non trovato: \n"+e.getStackTrace());
        }
	}

}
