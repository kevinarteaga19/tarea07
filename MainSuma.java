package matrices;

import java.util.Arrays;

public class MainSuma {

    public static void main(String[] args) {

        int[][] matriz1 ={{4,5,7},{7,8,6},{7,8,2}};

        int[][] matriz2 = {{8,5,6},{8,2,4},{2,5,8}};

        int[][] resultado;

        SumaMatrices sumaMatrices = new SumaMatrices(matriz1, matriz2);

        try {
            resultado = sumaMatrices.getresultado();

            System.out.println("Suma de las matrices");

            for (int[] vector : resultado)
            {
                System.out.println(Arrays.toString(vector));
            }
        } catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
    }
}
