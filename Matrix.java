import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        //get matrix from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Matrix size : ");
        int n = sc.nextInt();
        System.out.println();
        //first matrix
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        System.out.println("Enter Matrix First row by row");
        for(int i = 0; i <n; i++){
            for (int j = 0; j<n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter Matrix Second row by row");;
        for(int i = 0; i <n; i++){
            for (int j = 0; j<n; j++){
                B[i][j] = sc.nextInt();
            }
        }

        //multiplication answer matrix
        int[][] C = new int[n][n];
        multiplicationMatrix(A,B,C);
        printMatrix(C);

    }
    //print matrix
    static void printMatrix(int[][] matrix){
        for(int[] element : matrix){
            System.out.println(Arrays.toString(element));
        }
    }
    static void multiplicationMatrix(int[][] A, int[][] B, int[][] C){
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
    }
}
