
public class roll {
	static int[] arr = {10,3,1,0,11,4,7,8,2};
	static int[] hash = new int[9];

	public int hash(int i) {
		hash[((2*i)+50) % hash.length] = i;
		return ((2*i)+50) % hash.length;
	}

	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			System.out.print(hash[i]+" ");
		}
	}

	public static void main(String[] args) {
		roll obj = new roll();

		for (int i = 0; i < arr.length; i++) {
			System.out.println("hash index of " + arr[i] + " is " + obj.hash(arr[i]));
		}

		obj.disphashtable();
	}
}