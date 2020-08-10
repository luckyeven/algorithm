import java.util.Arrays;

/**
* <h1>binarySearch</h1>
* binarySearch takes an  array and an element.
* the function return true if  if the 
* element is in the array.
*
* @author shifeng song ssong@094@uottawa.ca
* @version 2
* @since 2020-08-06
*/
public class BinarySearch{
	
	private int[] tmp;

	public BinarySearch(int[] array){
		tmp = new int[array.length];
		for (int i=0;i<array.length;i++){
			tmp[i] = array[i];
		}
		Arrays.sort(tmp);
	}

	public boolean contains(int key){return search(key)!=-1;}

	public int search(int key){
		int low = 0;
		int high = tmp.length-1;

		while(low<=high){
			int mid = low+(high-low)/2;
			if(key>tmp[mid]){low = mid+1;}
			else if(key<tmp[mid]){high= mid-1;}
			else{return mid;};
		}
		return -1;
	} 
}
