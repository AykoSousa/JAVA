import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int base = 0;
        int valor = 0;
        String nome = "";

        System.out.println("Tabuada");

        System.out.println("**************************");

        System.out.println("Hey! Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("**************************");

        System.out.printf("Ola %s! Digite um numero para conferir a tabuada: ", nome);
        base = scan.nextInt();

        System.out.println("**************************");

        while(valor <= 10){
            System.out.printf("%d x %d = %d%n", base, valor, (base * valor));
            valor = valor + 1;
        }

        System.out.println("Fim do Programa!");
    }
}
