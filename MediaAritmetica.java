import java.util.Scanner;

//Programa em Java que calcule a média aritmética de três números inteiros fornecidos pelo usuário. 
//O programa solicitar os três números, calcular a média e exibir o resultado na tela.


public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Calcula a média aritmética
        double media = (numero1 + numero2 + numero3) / 3.0;

        // Exibe o resultado
        System.out.printf("A média aritmética dos três números é: %.2f\n", media);

        // Fecha o scanner
        scanner.close();
    }
}
