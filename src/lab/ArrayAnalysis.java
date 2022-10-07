package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		
		int[][] random = new int [row][column]; //create a new array
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				int element = (int)(Math.random() * (max - min) + 1);//puts random elements from the range to the array
				random[i][j] = element;
			}
		}
		
		return random;
	}
	
	
	//#2
	public static void printArray(int[][] arr)  {
		
		if(arr == null) {
			System.out.println("Array is null");
			return;
		}
		
		for (int[] row : arr) {
			for (int element: row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		
		int totalSum = 0;
		
		for (int[] row : arr) {
			for (int element: row) {
				totalSum += element;//adds each element to the total sum
			}
		}
		
		return totalSum;
	}
	
	
	//#4
	public static double average(int[][] arr) {
		
		int sumForAv = 0;
		//similar to last one
		for (int[] row : arr) {
			for (int element: row) {
				sumForAv += element;
				}
		}
		
		int average = sumForAv/arr.length;//divides the sum by the total num of elements in the array
		
		return average;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		
		int curMin = Integer.MAX_VALUE;//sets to highest max value
		
		for(int[]row:arr) {
			for(int element: row) {
				curMin = Math.min(element, curMin);//compares using the math method for min
			}
		}
		
		
		return curMin;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		
		int curMax = Integer.MIN_VALUE;//sets to lowest min value
		
		for(int[]row:arr) {
			for(int element: row) {
				curMax = Math.max(element, curMax);//compares using the math method for max
			}
		}
		
		return curMax;
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		//array for storing difference of each element
		
		
		if(arr1.length == arr2.length) {//checks if num of rows are same
			int x = arr1.length;
			
			if (arr1[0].length == arr2[0].length) {//checks if num columns are same
				int y = arr1[0].length;
				
				int[][] diffArray = new int[x][y];
			
				for(int i = 0; i < arr1.length; i++) {
					for(int j =0; j < arr1[0].length; j++) {
						diffArray[i][j] = arr1[i][j] - arr2[i][j];//takes the difference of arr1 and arr2
					}
				}
				
				return diffArray;
				
			}  
			
		}
		return null;//returns null if any conditions are false
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		
		if (arr1 == null) {
			return null;
		}
		
		int rows = arr1.length;//number of rows
		int columns = arr1[0].length;//number of columns
		int[][] transposedArr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				int k = i + dist; //k is for keeping track of rows
				
				if (k > rows-1) {
					k = k - rows;//so that its sent back to the top
				}
				transposedArr[k][j] = arr1[i][j];
				
			}
		}
		
		return transposedArr;

	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		//similar to 2d array sum
		int Sum3 = 0;
		
		for (int[][] height : arr) {//3 dimensions so has height, row, and element
			for (int[] row : height) {
				for(int element:row) {
					Sum3 += element;
				}
			}
		}
		

		return Sum3;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		//similar to 2d array average
		int sum = 0;
		
		for(int [][] height : arr) {
			for(int [] row : height) {
				for(int element : row) {
					sum += element;
				}
			}
		}
		
		return sum/arr.length;//divides the total sum by the num of elements in the array
	}
	
	
	
	
	
	
}
