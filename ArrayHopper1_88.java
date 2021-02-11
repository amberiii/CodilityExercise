package DP1;

public class ArrayHopper1_88 {
	// Method 1: DP, canJump[i] means from index 0; can jump index i;
	public static boolean canJump(int[] array) {
		// Assumptions: array is not null and is not empty.
		boolean[] canJump = new boolean[array.length];
		canJump[0] = true;
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				// if index j is reachable from index 0, and from index j
				// it is possible to jump to index i
				System.out.println("j: " + j);
				System.out.println("canJump[j]: " + canJump[j]);
				System.out.println("array[j]: " + array[j]);
				System.out.println("i: " + i);
				System.out.println("---yeah---");
				if (canJump[j] && array[j] + j >= i) {
					canJump[i] = true;
					break;
				}
			}
		}
		return canJump[array.length - 1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{2,3,1,1,4};
		boolean output = canJump(input);
		System.out.println("result: " + output);

	}

}
