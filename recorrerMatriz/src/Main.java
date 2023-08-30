public class Main {
    public static void main(String[] args) {
        int [][] matriz= {{1,3,4,5},{3,4,5,6},{2,1,1,1}};
        System.out.println(recorrerMatriz(matriz,0,0));
    }


    public static int recorrerMatriz(int[][] matriz, int i, int j) {
        if(matriz.length-1==i){
            if(matriz[0].length-1==j){
               return matriz[i][j];

            }else {
                return recorrerMatriz(matriz,i,j+1)+matriz[i][j];
            }
        }
        else {
            if(matriz[0].length-1==j){
                return recorrerMatriz(matriz,i+1,0)+matriz[i][j];

            }else {
                return recorrerMatriz(matriz,i,j+1)+matriz[i][j];
            }

        }
    }

    }