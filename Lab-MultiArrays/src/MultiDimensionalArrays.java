
public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][][] my3rdArray = new int[3][3][3];
		
		my3rdArray[0][0][0] = 1;
		System.out.println(my3rdArray[0][0][0]);
		
		int[][] my2ndArray = {{1,2,0},{4,5,6},{1,4,5}};
		System.out.println(my2ndArray.length);
		
		System.out.println(my2ndArray[1][2]);
	}
}
