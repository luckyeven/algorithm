/**
* <h1>selectionSort<h1/>
* this is impementation of selection sort algorithm.
*
* @author shifeng song , ssong094@uottawa.ca
* @since 2020-08-06
*/

public class selectionSort {
	private int[] arr;
	public selectionSort(int[] arr){
		this.arr = arr;
		sort();
	}

	/**
	* sort the array using selection sort algorithm.
	* 
	* 
	*/
	public void sort(){
		int len = arr.length;
		int [] sorted = new int[len];

		for(int i = 0;i<len;i++){
			int smallest_index = findSmallest();
			sorted[i]= arr[smallest_index];
			pop(arr,smallest_index);
			
		}
		arr = sorted;
		
	}

	/**
	* find the index of smallest value in the array
	*
	* 
	* @return smallest_index  the index of the smallest value
	*/
	public int findSmallest(){
		int smallest = arr[0];
		int smallest_index = 0;

		for (int i = 0;i< arr.length;i++){
			if(arr[i]< smallest){
				smallest = arr[i];
				smallest_index = i;
			}
		}
		
		return smallest_index;
	}

	/**
	* pop up given element from array
	*
	* @param indexOfelement given element
	* @param array
	*/
	public void pop(int[]array,int indexOfelement){
		int [] tmp = new int [array.length -1];
		int count = 0;
		for(int i=0;i<array.length;i++){
			if(i!= indexOfelement){
				tmp[count] = array[i];
				count++;
			}
			
		}
		arr = tmp;
	}

	public int[] getArray(){
		return arr;
	}


}