public class main{
	public static void main(String[] args) {
		
		testbinarySearch();
		testSelectionSort();
		testrecursionSum();



	}
	public static void testbinarySearch(){
		System.out.println("");
		System.out.println("********************");
		System.out.println("Test binarySearch");
		int [] list = new int [5];
		list[0] = 1;
		list[1] = 3;
		list[2] = 5;
		list[3] = 7;
		list[4] = 9;
		System.out.print("given list: ");
		for(int element: list){
			System.out.print(" "+ element);
		}
		new binarySearch(list,1);
		char [] list2 = new char [5];
		list2[0] = 'a';
		list2[1] = 'b';
		list2[2] = 'c';
		list2[3] = 'd';
		list2[4] = 'e';
		System.out.print("given list: ");
		for(char element: list2){
			System.out.print(" "+ element+" ");
		}
		new binarySearch(list2,'h');
	}
	public static void testSelectionSort(){
		System.out.println("");
		System.out.println("********************");
		System.out.println("Test selectionSort");
		int [] arr1 = new int[11];
		arr1[0] = 4;
		arr1[1] = 3;
		arr1[2] = 7;
		arr1[3] = 6;
		arr1[4] = 9;
		arr1[5] = 1;
		arr1[6] = 5;
		arr1[7] = 0;
		arr1[8] = 8;
		arr1[9] = 2;
		arr1[10]= 0;
		System.out.println("given array: ");
		for(int element: arr1){
			System.out.print(" "+ element);
		}
		System.out.println("");

		int[] arr2 =new selectionSort(arr1).getArray();
		System.out.println("sorted");
		for(int element: arr2){
			System.out.print(" "+ element);
		}
		System.out.println("");
	

	}
	public static void testrecursionSum(){
		System.out.println("");
		System.out.println("********************");
		System.out.println("Test recursionsum:");
		int[] arry = new int [100];
		for (int i =0;i<100;i++){
			arry[i] = i*i;
		}

		int sum = new recursionSum(arry).getSum();
		System.out.println("the sum for [1,4,9....,99*99]is: "+ sum);


		int[] arry2 = new int [10];
		for (int i =0;i<10;i++){
			arry2[i] = i;
		}

		int sum2 = new recursionSum(arry2).getSum();
		System.out.println("the sum for [0,1,2,3,4,5,6,7,8,9 ]is: "+ sum2);
	}


}