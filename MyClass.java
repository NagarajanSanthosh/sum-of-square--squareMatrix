package MyClass;
import java.util.*;
public class MyClass{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i =0;i<n;i++)
            for (int j =0;j<n;j++)
                matrix[i][j]=scanner.nextInt();
        System.out.println(matrix.length);
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int squareSum = 0;
                for (int row = i; row <= i + 1; row++)
                    for (int col = j; col <= j + 1; col++)
                        squareSum += matrix[row][col];
                System.out.print(squareSum + " ");
            }
        }
    }
}