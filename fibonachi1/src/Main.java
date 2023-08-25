public class Main {

    public static int fib(int n){
        if (n <= 1) return n;
        else
            System.out.println(n); System.out.println("izquierda"+ (n-1));
        System.out.println("derecha"+(n-2));
            return fib(n-1)+fib(n-2);    //condición recursiva
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}