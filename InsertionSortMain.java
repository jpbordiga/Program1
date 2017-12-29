// JEFF BORDIGA
// PROGRAM1
// 9/15/17

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class InsertionSortMain {

	public static void main(String[] args){
		
		ArrayList<Integer> arr = createList();
		InsertionSort iS = new InsertionSort(arr);
		
	}

	public static ArrayList<Integer> createList(){
		
		String fileName = "numbers.txt";           
		Scanner inFile = null;
		ArrayList<Integer> arr = new ArrayList<>();
	
		try{
			inFile = new Scanner(new FileInputStream(fileName));
		} catch(FileNotFoundException e){
			System.out.println("ERROR: unable to open file " + fileName);
			System.exit(0);
		}
		
		try{
			
			for(Integer i = inFile.nextInt(); i != null; i = inFile.nextInt()){
				arr.add(i);
			}
			
		} catch(NoSuchElementException e){
			//
		}
		return arr;
	}
	
}
