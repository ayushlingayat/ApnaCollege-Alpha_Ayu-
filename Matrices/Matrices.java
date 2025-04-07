import java.util.*;
public class Matrices{
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n =matrix.length , m =matrix[0].length; 
        //matrix.length means row
        //Matrix[0].lenght matlab column 

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                //Aesha access karte okk 
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output 
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                //Aesha access karte okk 
                 
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

