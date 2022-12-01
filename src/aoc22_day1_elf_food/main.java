package aoc22_day1_elf_food;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import objects.Elf;
import objects.FoodItem;

/**
 * @author niidh
 *
 */
public class main {

	public static void main(String[] args) throws IOException {
		// La variable args contient les arguments passés au programme. 
		// Ici il faudra rentrer le chemin vers un fichier .txt contenant l'input donné par le site advent of code !
		File input = new File(args[0]);
		
		// Ici je fais mon parse pour donner une liste d'elfes
		ArrayList<Elf> theElves = parseFile(input);
		
		
		//TODO: ajouter le code pour donner l'elfe qui a le plus de calories sur lui !
	}
	
	/**
	 * Reads an input file to turn it into useable objects
	 * @param input the file containing the data to read
	 * @return an ArrayList (https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) of Elf objects
	 * @throws IOException 
	 */
	public static ArrayList<Elf> parseFile(File input) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(input));

		// une variable qui contiendra la ligne courante de l'input
		String currentLine;
		
		// une variable pour stocker ma liste d'elfes
		ArrayList<Elf> result = new ArrayList();
		
		// une variable pour stocker mes FoodItem
		ArrayList<FoodItem> laNourritureDeLElfe = new ArrayList();
		
		while ((currentLine = br.readLine()) != null) {

	        // Print the string
//	        System.out.println(currentLine);
	        
	        if(currentLine.length()>0) {
	        	// pas seulement un espace vide, on crée un objet de nourriture et on l'ajoute à notre elfe en cours !
	        	laNourritureDeLElfe.add(new FoodItem(Integer.valueOf(currentLine)));
	        	
	        }else {
	        	// espace vide, on ajoute notre elfe à la liste et on le remplace par le suivant !
	        	result.add(new Elf(new ArrayList<FoodItem>(laNourritureDeLElfe)));
	        	laNourritureDeLElfe.clear();
	        }
		}
    	// la dernière ligne n'a pas été vidée car currentLine était à null, on doit donc créer notre dernier elfe ici
    	result.add(new Elf(new ArrayList<FoodItem>(laNourritureDeLElfe)));
    	laNourritureDeLElfe.clear();
    	
		return result;
	}

}
