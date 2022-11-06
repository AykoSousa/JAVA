import java.util.Scanner;

public class Entrada {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n1 = 0, n2 = 0, res = 0;
        String nome = "";

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite um numero: ");
        n1 = scan.nextInt();

        System.out.println("Digite outro numero: ");
        n2 = scan.nextInt();

        res = n1 + n2;
        System.out.printf("A soma de %d + %d e igual a %d%n", n1, n2, res);

        System.out.printf("%s o resultado da soma de %d + %d e igual a %d%n", nome, n1, n1, res);

        Scanner scanner = new Scanner(System.in);

        float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, notaFinal = 0;
        final float media = 7; //Final = constante
        String aluno = "";

        System.out.println("Digite o nome do aluno: ");
        aluno = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextInt();

        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextInt();

        notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        if(notaFinal >= media){
            System.out.printf("O aluno(a) %s foi APROVADO! Com a nota final de: %f%n", aluno, notaFinal);
        }else if(notaFinal == 6){
            System.out.printf("O aluno(a) %s esta em RECUPERACAO! Com a nota final de: %f%n", aluno, notaFinal);
        }
        else{
            System.out.printf("O aluno(a) %s foi REPROVADO! Com a nota final de: %f%n", aluno, notaFinal);
        }
        
    }
}
