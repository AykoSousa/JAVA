public class ComandoDescisao {
    public static void main(String[] args){
        
        int nota = 50;
        int media = 60;
        int Faltas = 10;
        int maxFaltas = 5;
        String result;

        //Operação ternaria
        result = (nota >= media ? "Aprovado!" : "Reprovado");
        System.out.println("Resultado: " + result);

        if (nota >= media && Faltas <= maxFaltas){
            System.out.println("Aprovado");
        }
        else if(nota >= 40){
            System.out.println("Recuperacao");
        }
        else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do Programa");
    //######################################################################################################
        int posicao = 1;

        switch(posicao){
            case 1:
            System.out.print("Primeiro lugar");
            break;
            case 2:
            System.out.println("Segundo lugar");
            break;
            case 3:
            System.out.print("Terceiro lugar");
            break;
            case 4: case 5: case 6:
            System.out.println("Premio de consolacao");
            break;
            default:
            System.out.println("Não entrou no podio");
            break;
        }
    }
}
