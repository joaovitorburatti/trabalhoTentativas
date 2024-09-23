import java.util.Random;
import java.util.Scanner;

public class trabalhoTentativas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroAle = aleatorio.nextInt(100)+1;
        int tentativas = 0;
        int tentresto = 10;
        
        System.out.println("Bem vindo a roleta.");
        System.out.println("Você tem "+ tentresto + "tentativas...");
        System.out.println("Digite um número de 1 à 100 e veja se acertou!");

        while (tentativas < tentresto){
            System.out.println("Digite um número:");
            int chute = ler.nextInt();
            tentativas++;
            int resttent = tentresto-tentativas;
            if (chute == numeroAle){
                System.out.println("Parabéns você acertou em " + tentativas + " tentativas.");
                break;
            }else if (chute < numeroAle){
                System.out.println("O número sorteado é maior que o último digitado.");
                System.out.println("Restam "+ resttent + " tentativas");
            }else{
                System.out.println("O número sorteado é menor que o último digitado.");
                System.out.println("Restam "+ resttent + " tentativas");
            }
        }
        if (tentativas == tentresto)
            System.out.println("Suas tentativas acabaram, o número era: " + numeroAle);
        
    }
    
}