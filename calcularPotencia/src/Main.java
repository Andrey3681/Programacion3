public class Main {
    public static void main(String[] args) {
        int base=2;
        int exponente=3;
        System.out.println(calcularExponente(base,exponente,1));
    }

    //calcular exponente

    private static int calcularExponente(int base, int exponente,int i) {
        if(i==exponente){
            return base;
        }
        else {
            return calcularExponente(base,exponente,i+1)*base;
        }

    }
}