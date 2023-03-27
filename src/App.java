import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite um número para exibir sua tabela de multiplicação: ");
    int numero = scanner.nextInt();
    
    System.out.println("Tabela de multiplicação de " + numero + ":");
    
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
    
    scanner.close();
}
}