/**
* <h1>binarySearch</h1>
* binarySearch takes an ordered array and an element.
* the function return the index of this element if the 
* element is in the array.
*
* @author shifeng song ssong@094@uottawa.ca
* @version 1
* @since 2020-08-06
*/
public class binarySearch{
	int low;
	int high;
	public binarySearch(String[] list, String element){

		search(list,element);

	}
	public binarySearch(char[] list, char element){
		String [] tmp = new String[list.length];
		String ele = String.valueOf(element);
		for(int i =0 ;i<list.length;i++){
			tmp[i] = String.valueOf(list[i]);

		}
		
		search(tmp,ele);
	}
	public binarySearch(int [] list, int element){
		String [] tmp = new String[list.length];
		String ele = String.valueOf(element);
		for(int i = 0;i<list.length;i++){
			tmp[i]= String.valueOf(list[i]);
		}
		search(tmp,ele);
	}
	/**
	* this method print the index of an element in the given 
	* list.
	*
	* @param list the list gonna to search
	* @param element given element
	*/

	public void search(String[] list, String element){
		low =0;
		high = list.length-1;
		int mid;
		while(low<=high){
			
				mid = (low+high)/2;
				String guess= list[mid];
				if(guess.equals(element)){
					System.out.println("index of "+element+" is "+mid);
					return;
				}else if(guess.compareTo(element)>0){
					high = mid -1;
				}else{
					low = mid +1;
				}
			
	
			
		}
		System.out.println(element+" is not in the list");
	}

}
