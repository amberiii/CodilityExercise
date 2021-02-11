package DP1;

public class MaxProductCuttingRope_87 {
	/////////////////////////////
	// Method 1: 左大段 + 右大段 //
	/////////////////////////////
	public static int maxProduct_1(int length) {
		// assumption length >= 2
		int[] array = new int[length + 1];
		array[1] = 0;
		for (int i = 2; i <= length; i++){
			for (int j = 1; j <= i / 2; j++) {
				array[i] = Math.max(array[i], Math.max(j, array[j]) * Math.max((i-j), array[i-j]));
			}
		}
		return array[length];
	}
	/////////////////////////////
	// Method 2: 左大段 + 右小段 //
	/////////////////////////////
	public static int maxProduct_2(int length) {
		int[] array = new int[length + 1];
		array[1] = 0;
		for(int i = 2; i <= length; i++) {
			for (int j = 1; j < i; j++) {
				array[i] = Math.max(array[i], Math.max(array[j], j)*(i-j));
			}
		}
		return array[length];
 		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 7;
		int output = maxProduct_1(input);
		System.out.print("result: " + output);
		
	}

}
