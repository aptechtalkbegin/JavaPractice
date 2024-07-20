package practicePrograms;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int arr[][]= {{2,3,4},{5,6,7},{2,4,9}};
		System.out.print("Output:");
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print("[");
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
				if(j<arr.length-1) {
					System.out.print(",");
				}
			}
			System.out.print("]");
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		
		System.out.println("]");

	}

}
