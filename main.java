public class main{
	public static void main(String[] args) {
		int [] list = new int [5];
		list[0] = 1;
		list[1] = 3;
		list[2] = 5;
		list[3] = 7;
		list[4] = 9;
		new binarySearch(list,1);
		char [] list2 = new char [5];
		list2[0] = 'a';
		list2[1] = 'b';
		list2[2] = 'c';
		list2[3] = 'd';
		list2[4] = 'e';
		new binarySearch(list2,'h');
	}
}