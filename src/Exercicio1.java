import java.util.Scanner;
public class Exercicio1 {
    static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n - 2) ;
        }
    }
    public static void main(String[] args) {
        int n1;
        boolean pertence = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        n1 = scan.nextInt();

        System.out.println(fibonacci(n1));
        for(int i=0; i <= n1; i++){
            if(n1 == fibonacci(i)) {
                pertence = true;
            }
        }
        if(pertence){
            System.out.println("pertence");
        }else{
            System.out.println("nao pertence");
        }

    }

}