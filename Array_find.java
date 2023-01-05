
public class Array_find {
	static boolean find(int[] a, int v) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==v) 
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println(find(arr,10));
	}

}
