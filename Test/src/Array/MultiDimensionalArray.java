package Array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myNumber= {{2,5,3,5},{5,8,9,4},{8,4,3,5,},{4,5,6,2},{2,7,6,3}};
		for(int i=0;i<myNumber.length;i++)
		{
			for(int j=0;j<myNumber[i].length;j++)
			{
				System.out.print(" "+myNumber[i][j]);
			}
			System.out.println();
		}
	}
		
}


