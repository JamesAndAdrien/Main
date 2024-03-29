/*
** Private property of James and Adrien (+ Mr Fontaine)
** All rights reserved
**
*/

package matrixOperations;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String op = "";
		
		String op1 = "";
		
		String op2 = "";
		
		int[] dim1 = null;
		
		int[] dim2 = null;
		
		dim1 = new int[2];
		
		dim2 = new int[2];
		
		double[][] M1 = null;
		
		double[][] M2 = null;
		
		double[][] M3 = null;
		
		boolean valid = false;
		
		while (valid == false) {
			
			System.out.println("What matrix operation would you like? ");
			
			op2 = scan.nextLine();
			
			op1 = op2.trim();
			
			op = op1.toLowerCase();
				
			if (op.equals("multiplication")) {
				
				valid = true;
				
				System.out.println("Multiplication. ");
				
				System.out.println("Please enter the dimensions of your first matrix: ");
				
				System.out.println("Rows: ");
				
				dim1[0] = scan.nextInt();
				
				System.out.println("Columns: ");
				
				dim1[1] = scan.nextInt();
				
				System.out.println("Your matrix is " + dim1[0] + " by " + dim1[1] + ".");
				
				System.out.println("Please enter the dimensions of your second matrix: ");
				
				System.out.println("Rows: ");
				
				dim2[0] = scan.nextInt();
				
				System.out.println("Columns: ");
				
				dim2[1] = scan.nextInt();
				
				System.out.println("Your matrix is " + dim2[0] + " by " + dim2[1] + ".");
				
			
				if (dim1[1] == dim2[0]) {
					
					M1 = new double[dim1[0]][dim1[1]];
					
					System.out.println("Please enter the elements of the first matrix row by row: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						for (int j = 0; j < dim1[1]; j++) {
							
							System.out.println("Element (" + (i+1) + "," + (j+1) + ") is: ");
							
							M1[i][j] = scan.nextDouble();
							
						}
						
						
						
					}
					
					System.out.println("Your first matrix: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim1[1]; j++) {
							
							System.out.print(M1[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
					M2 = new double[dim2[0]][dim2[1]];
					
					System.out.println("Please enter the elements of the second matrix row by row: ");
					
					for (int i = 0; i < dim2[0]; i++) {
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.println("Element (" + (i+1) + "," + (j+1) + ") is: ");
							
							M2[i][j] = scan.nextDouble();
							
						}
						
					}
					
					System.out.println("Your second matrix: ");
					
					for (int i = 0; i < dim2[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.print(M2[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
//fixed this part!!! forgot to run through all indices!
					
					M3 = new double[dim1[0]][dim2[1]];
					
					for (int i = 0; i < dim1[0]; i++) {
						
						for (int j = 0; j < dim2[1]; j++) {
							
							double x = 0;
							
							for (int k = 0; k < dim1[1]; k++) {
								
								x = x + M1[i][k]*M2[k][j];
								
							}
							
							M3[i][j] = x;
							
						}
						
					}
					
					System.out.println(" ");
					
					System.out.println("The product matrix is: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.print(M3[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
				}
				
				else {
					
					System.out.println("Your dimensions aren't compatible for matrix multiplication!");
					
				}
				
			}
			
			else if (op.equals("addition")) {
				
				valid = true;
				
				System.out.println("Addition: ");
				
				System.out.println("Please enter the dimensions of your first matrix: ");
				
				System.out.println("Rows: ");
				
				dim1[0] = scan.nextInt();
				
				System.out.println("Columns: ");
				
				dim1[1] = scan.nextInt();
				
				System.out.println("Your matrix is " + dim1[0] + " by " + dim1[1] + ".");
				
				System.out.println("Please enter the dimensions of your second matrix: ");
				
				System.out.println("Rows: ");
				
				dim2[0] = scan.nextInt();
				
				System.out.println("Columns: ");
				
				dim2[1] = scan.nextInt();
				
				System.out.println("Your matrix is " + dim2[0] + " by " + dim2[1] + ".");
				
				if (dim1[0] == dim2[0] && dim1[1] == dim2[1]) {
					
					M1 = new double[dim1[0]][dim1[1]];
					
					System.out.println("Please enter the elements of the first matrix row by row: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						for (int j = 0; j < dim1[1]; j++) {
							
							System.out.println("Element (" + (i+1) + "," + (j+1) + ") is: ");
							
							M1[i][j] = scan.nextDouble();
							
						}
						
						
						
					}
					
					System.out.println("Your first matrix: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim1[1]; j++) {
							
							System.out.print(M1[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
					M2 = new double[dim2[0]][dim2[1]];
					
					System.out.println("Please enter the elements of the second matrix row by row: ");
					
					for (int i = 0; i < dim2[0]; i++) {
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.println("Element (" + (i+1) + "," + (j+1) + ") is: ");
							
							M2[i][j] = scan.nextDouble();
							
						}
						
					}
					
					System.out.println("Your second matrix: ");
					
					for (int i = 0; i < dim2[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.print(M2[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
					M3 = new double[dim1[0]][dim2[1]];
					
					for (int i = 0; i < dim1[0]; i++) {
						
						for (int j = 0; j < dim2[1]; j++) {
							
							M3[i][j] = M1[i][j]+M2[i][j];
							
						}
					
					}
					
					System.out.println(" ");
					
					System.out.println("The sum matrix is: ");
					
					for (int i = 0; i < dim1[0]; i++) {
						
						System.out.print("[ ");
						
						for (int j = 0; j < dim2[1]; j++) {
							
							System.out.print(M3[i][j] + " ");
							
						}
						
						System.out.println("]");
					}
					
				}
				
				else {
					
					System.out.println("Your dimensions aren't compatible for matrix addition!");
					
				}
				
				
				
			}
			
			else if (op.equals("determinant")) {
				
				valid = true;
				
				System.out.println("Multiplication. ");
				
				System.out.println("Please enter the dimensions of your matrix: ");
				
				System.out.println("Rows: ");
				
				dim1[0] = scan.nextInt();
				
				System.out.println("Columns: ");
				
				dim1[1] = scan.nextInt();
				
				System.out.println("Your matrix is " + dim1[0] + " by " + dim1[1] + ".");
				
				if (dim1[0] == dim1[1]) {
					
					
					
				}
				
			}
			
			else {
				
				valid = false;
				
			}
			
		}
		
	}
	
}

