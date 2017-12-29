import java.util.ArrayList;

public class InsertionSort implements InsertionSortInterface{

	private ArrayList<Integer> numbers = new ArrayList<>();
	
	public InsertionSort(ArrayList<Integer> arr){
		numbers = arr;
		sort(numbers);
		printList(numbers);
	}
	
	@Override
	public ArrayList<Integer> sort(ArrayList<Integer> arr){ // sorts accepted arraylist
		
		int i = 0;
		int key = 0;
		
		for(int j = 1; j < (arr.size()); j++){

			key = arr.get(j);
			i = j - 1;
			
			while((i >= 0) && (arr.get(i) > key)){
				arr.set((i + 1), arr.get(i));
				i = i - 1;
			}
			arr.set((i + 1), key);
		}
		return arr;
	}

	@Override
	public void printList(ArrayList<Integer> arr){ // print sorted list
		for(int i = 0; i < (arr.size()); i++){
			System.out.println(arr.get(i));
		}
	}
	
}