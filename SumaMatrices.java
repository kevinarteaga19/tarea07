package matrices;

public class SumaMatrices {

   private  int matriz1[][];

   private int matriz2[][];

    public SumaMatrices(int[][] matriz1, int[][] matriz2) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
    }

    public int[][] getMatriz1() {
        return matriz1;
    }

    public void setMatriz1(int[][] matriz1) {
        this.matriz1 = matriz1;
    }

    public int[][] getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(int[][] matriz2) {
        this.matriz2 = matriz2;
    }

    public int[][] getresultado() throws Exception //para dar una exception
    {
        int[][] resultado;

        resultado = new int[matriz1.length][matriz1[0].length];

        if (matriz1.length == matriz2.length && matriz1[0].length == matriz2[0].length)
        {
            for (int i=0; i < matriz1.length; i++)
            {
                 for (int j=0; j < matriz1[i].length; j++)
                 {
                      resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                 }
            }
        } else {
          throw new Exception  ("El tamaño de las matrices no son iguales");
        }
            return resultado;
    }
}
