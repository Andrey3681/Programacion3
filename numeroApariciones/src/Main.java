import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int buscarElemento(ArrayList<Integer>arreglo,int fin, int elemen){
        if(fin>=arreglo.size()-1){
            if(arreglo.get(fin)==elemen){
                return 1;
            }
            else {
                return 0;
            }
        }
        else if(arreglo.get(fin)==elemen){
            return buscarElemento(arreglo,fin+1,elemen)+1;

        }
        else {
            return buscarElemento(arreglo,fin+1,elemen);
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer>prueba=new ArrayList<>(Arrays.asList(2,2,21,3,3,4,4,5,6,2));

        System.out.println(buscarElemento(prueba,0,2));
    }
}