import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Sempre que precisar repetir um comando, usamos loops
        //For
        for(int cont = 0; cont < 10; cont ++){
            System.out.println("CFB Cursos");
        }
        for (int cont = 10; cont > 0; cont --){
            System.out.println(cont);
        }
        //While
        int cont = 0;
        while(cont < 5){
            System.out.println(cont + " - JAVA");
            cont ++; //Incremento sempre ao fim do bloco
        }
        int max = scan.nextInt();
        cont = 0;
        while(cont < max){
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }
        //Do while
        int c = 0;
        do{
            System.out.println(cont + " - CFB Cursos");
            c++;
        }while(c < 0);//Começo executando depois verifico a condição

        System.out.println("Fim do Programa!");
    }
}
