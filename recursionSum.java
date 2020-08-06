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
	
		sum = sum(list);
	}

	public int sum(int[] list){
		if(list.length<2){//base case

			return list[0];
		}else{      //recursive case
			int[] tmp = new int[list.length-1];
			for(int i=0; i< tmp.length;i++){
				tmp[i] = list[i+1];
			}
			return list[0] +sum(tmp);
		}
		
	}

	public int getSum(){
		return sum;
	}
}