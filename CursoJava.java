public class CursoJava {
    public static void main(String[] args){

        int num = 100;
        num = 50;
        String nome = "Ayko";
        int num1=10, num2=20, num3=30;
        int res = num1 + num2 + num3;



        //Comandos de saída
        System.out.print("CFB Cursos");
        
        System.out.println("Curso de Java");

        System.out.printf("Canal: %s | Ano: %d%n", "CFB Cursos", 2022);
        //Comando de saída com formatação.
        //%s=string %d=inteiro %f=float.
        //%n=quebra de linha.
        System.out.printf("Valor da variavel num:%d%n", num);

        System.out.print(nome);

        System.out.printf("%nA soma de %d, %d, %d e igual a %d", num1, num2, num3, res);
    }
}