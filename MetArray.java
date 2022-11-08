import java.util.Arrays;

public class MetArray {
    public static void main(String[] args){
        final int tam = 10;
        int [] num = {10, 20, 30, 40, 50};
        int [] numeros = {9, 2, 7, 1, 8, 5, 3, 4, 0, 6};
        int[] numero = new int[tam];
        int p =3;
        int pos;
        /*
        for(int i=0; i<num.length; i++){
            System.out.printf("%d", num[i]);
        }
        */

        //Arrays.sort(numeros);//Organizando os elementos do array.

        //Arrays.fill(numero, 10);//Preenchendo um array 

        //System.arraycopy(num, 0, numeros, 0, tam);//Copiando um array para o outro

        //Arrays.equals(num, numeros);//Comparação de Arrays

        //System.out.printf("Arrays são iguais: %S", Arrays.equals(num, numeros) ? "Sim" : "Nao");

        Arrays.sort(numeros);
        pos = Arrays.binarySearch(numeros, p);
        System.out.printf("O elemento %d esta no array?: %s na posicao %d", p, pos > 0 ? "Sim!" : "Nao!");

        //for especial para array
        /*
        for(int n:numeros){//Já pega elemento por elemento
            System.out.printf("%d - ", n);
        }
        */
    }
}
