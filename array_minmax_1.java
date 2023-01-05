
public class array_minmax_1 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		arr[0] = 60;
		arr[1] = 62;
		arr[2] = 300;
		arr[3] = 30;
		arr[4] = 50;
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
	    System.out.println("Maximum value in the array:"+max);
	    for(int i = 0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
	    System.out.println("Minimum value in the array:"+min);
	    
	}

}
