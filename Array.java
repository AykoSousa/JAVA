//import java.util.Scanner;

public class Array {
    public static void main(String[] args){

        final int tam = 5;

        int [] num = new int[tam];//Instanciando e declarando quantas posições guardar

        int [] numeros = {10, 20, 30, 40, 50};//Inserindo dados no Array ja na inicialização
        num[0] = 10;//Inserindo dados dentro do array
        num[1] = 5;
        num[2] = 15;
        num[3] = 0;
        num[4] = 8;

        for(int i = 0; i < num.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }

        System.out.printf("%d%n", num[0]);
        System.out.printf("%d%n", numeros[4]);
    }
}
