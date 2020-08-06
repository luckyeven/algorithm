/**
* <h1>recursionSum<h1/>
* implement sum algorithm using recursion
*
* @author shifeng song, ssong094@uottawa.ca
* @since 2020-08-06
*/

public class recursionSum{
	int sum =0;
	public recursionSum(int[] list){
	
		sum = sum(list,0);
	}

	public int sum(int[] list,int head){
		if(head == list.length-1){//base case

			return list[head];
		}else{      //recursive case			
			
			return list[head] +sum(list,head+1);
		}
		
	}

	public int getSum(){
		return sum;
	}
}