package lab;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -2, 10);
		
		int[][]arr2 = analysis.createRandom(4, 3, 0, 90);
		
		System.out.print("Array 1: \n");
		ArrayAnalysis.printArray(arr1);
		
		System.out.println();
		System.out.println();

		System.out.print("Array 2: \n");
		ArrayAnalysis.printArray(arr2);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		//#3-6 array 1
		
		System.out.println("Array 1 total sum: " + ArrayAnalysis.sumTotal(arr1));
		System.out.println();
		
		System.out.println("Array 1 average: " + ArrayAnalysis.average(arr1));
		System.out.println();
		
		System.out.println("Array 1 lowest value: " + ArrayAnalysis.findMin(arr1));
		System.out.println();
		
		System.out.println("Array 1 highest value: " + ArrayAnalysis.findMax(arr1));
		System.out.println();
		System.out.println();
		System.out.println();
		
		//#3-6 array 2
		
		System.out.println("Array 2 total sum: " + ArrayAnalysis.sumTotal(arr2));
		System.out.println();
		
		System.out.println("Array 2 average: " + ArrayAnalysis.average(arr2));
		System.out.println();
		
		System.out.println("Array 2 lowest value: " + ArrayAnalysis.findMin(arr2));
		System.out.println();
		
		System.out.println("Array 2 highest value: " + ArrayAnalysis.findMax(arr2));
		System.out.println();
		
		//#7
		
		System.out.println("The different between each of the array's values in a new array: \n"); 
		ArrayAnalysis.printArray(ArrayAnalysis.diffArrays(arr1,  arr2));
		System.out.println();
		//#8
		
		System.out.println("Transposing Rows: ");
		ArrayAnalysis.printArray(ArrayAnalysis.transposeRow(arr1, 2));
		System.out.println();
		//printing out the 3d array
		
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -40, 40);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			ArrayAnalysis.printArray(arr);
			x++;
		}
		System.out.println();
		System.out.println();
		
		//#9
		
		System.out.println("The sum of the 3D Array: " + ArrayAnalysis.sum3D(arr3D));
		System.out.println();
		
		//#10
		
		System.out.println("The average of the 3D array: " + ArrayAnalysis.average3D(arr3D));

	}
	
	
	
	
	
	
	
}
