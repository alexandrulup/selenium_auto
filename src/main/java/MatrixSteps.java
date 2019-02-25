import java.util.Random;

public class MatrixSteps {

    Random randomno = new Random();
    int[][] matrice = new int[4][4];
    int suma=0;

    public void populateMatrix(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrice[i][j] = randomno.nextInt(100);
            }
        }
    }

    public void showMatrix(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void sumMatrix(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    suma += matrice[i][i];
                }
            }
        }
        System.out.println(suma);
    }

    public void diagonalaMatrix() {
        for (int i = 0; i < 4; i++) {
            System.out.println(matrice[i][4 - i - 1]);
        }
    }
}
